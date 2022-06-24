import java.util.*;
class Billing
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the number of Doctors: ");
    	int n = sc.nextInt();
    	sc.nextLine();
    	Doctor[] doc = new Doctor[n];
    	System.out.println("Enter the details of the Doctors: ");
    	for(int i = 0; i < n; i++)
    	{
    		System.out.println("Doctor "+(i+1)+":");
    		System.out.print("Enter the name of the Doctor: ");
    		String name = sc.nextLine();
    		System.out.print("Enter the speciality of the Doctor: ");
    		String sp = sc.nextLine();
    		System.out.print("Enter the fees of the Doctor: ");
    		int f = sc.nextInt();
    		System.out.println("Enter the date of hiring of the Doctor: ");
    		System.out.print("Year: ");
    		int y = sc.nextInt();
    		System.out.print("Month: ");
    		int m = sc.nextInt();
    		System.out.print("Date: ");
    		int d = sc.nextInt();
    		doc[i] = new Doctor(name, sp, y, m, d, f);
    		sc.nextLine();
    	}
    	System.out.print("Enter the number of patients: ");
    	int n2 = sc.nextInt();
    	sc.nextLine();
    	Patient p[] = new Patient[n2];
    	System.out.println("Enter the details of the Patients: ");
    	int temp = -1;
    	for(int i = 0; i < n2; i++)
    	{
    		System.out.println("Patient "+(i+1)+":");
    		System.out.print("Enter the name of the Patient: ");
    		String name = sc.nextLine();
    		System.out.print("Enter the name of the Doctor you want to consult: ");
    		String d = sc.nextLine();
    		for(int j = 0; j < n; j++)
    		{
    		    if(d.equalsIgnoreCase(doc[j].name))
    		    {
    		        temp = j;
    		        break;
    		    }
    		}
    		if(temp == -1)
    		{
    		    temp = 0;
    		}
    		System.out.println("Enter the date of admittance of the Patient: ");
    		System.out.print("Year: ");
    		int y1 = sc.nextInt();
    		System.out.print("Month: ");
    		int m1 = sc.nextInt();
    		System.out.print("Date: ");
    		int d1 = sc.nextInt();
    		sc.nextLine();
    		p[i] = new Patient(name, doc[temp], y1, m1, d1);
    	}
    	System.out.print("Enter the admission fees: ");
    	int adf = sc.nextInt();
    	System.out.println("Patient's Bills: ");
    	for(int i = 0; i < n2; i++)
    	{
    	    System.out.println("Name : "+p[i].name);
    	    System.out.println("Doctor Consulted :"+p[i].d.name);
    	    System.out.println("Date of Admission: "+p[i].D);
    	    System.out.println("Number of days stayed: "+p[i].days);
    	    System.out.println("Total amount to be paid: Rs."+(p[i].days*(p[i].d.fees + adf)));
    	    for(int j = 0; j < n; j++)
    	    {
    	    	if(p[i].eq(doc[j]))
    	    	{
    	    		doc[j].income += (p[i].d.fees * p[i].days);
    	    	}
    	    }
    	}
    	System.out.println("Fees of Doctor: ");
    	for(int i = 0; i < n; i++)
    	{
    		System.out.println("\nDoctor "+(i+1));
    		System.out.println("Name: "+doc[i].name);
    		System.out.println("Date of Hiring: "+doc[i].D);
    		System.out.println("Total Income: "+doc[i].income);
    	}
    }
}
class Person
{
	String name;
	Date D;
	Person(String name, int y, int m, int d)
	{
		this.name = name;
		D = new Date(y, m, d);
	}
}
class Patient extends Person
{
	Doctor d;
	Date D2;
	long days;
	Patient(String name, Doctor d, int y1, int m1, int d1)
	{
		super(name, y1-1900, m1-1, d1);
		this.d = d;
		D2 = new Date();
		days = (D2.getTime() - D.getTime())/(1000*60*60*24);
	}
	boolean eq(Doctor d)
	{
		if((this.d).name == d.name)
		{
			return true;
		}
		return false;
	}
}
class Doctor extends Person
{
	String sp;
	int fees;
	int income;
	Doctor(String name, String speciality, int y, int m, int d, int fees)
	{
		super(name, y-1900, m-1, d);
		sp = speciality;
		this.fees = fees;
		income = 0;
	}
}
