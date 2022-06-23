import java.util.*;
class Billing
{
	System.out.print("Enter the number of Doctors: ");
	int n = sc.nextInt();
	sc.nextLine();
	Doctor doc = new Doctor[n];
	System.out.println("Enter the details of the Doctors: ");
	for(int i = 0; i < n; i++)
	{
		System.out.println("Doctor "+(i+1)+":");
		System.out.print("Enter the name of the Doctor: ");
		String name = sc.nextLine();
		System.out.print("Enter the speciality of the Doctor: ");
		String sp = sc.nextLine();
		System.out.print("Enter the fees of the Doctor: ");
		int n = sc.nextInt();
		System.out.println("Enter the date of hiring of the Doctor: ");
		System.out.print("Year: ");
		int y = sc.nextInt();
		System.out.print("Month: ");
		int m = sc.nextInt();
		System.out.print("Date: ");
		int d = sc.nextInt();
		doc[i] = new Doctor(name, sp, y, m, d, n);
	}
	System.out.print("Enter the number of patients: ");
	int n2 = sc.nextInt();
	Patient p[] = new Patient[n2];
	System.out.println("Enter the details of the Patients: ");
	for(int i = 0; i < n2; i++)
	{
		System.out.println("Patient "+(i+1)+":");
		System.out.print("Enter the name of the Patient: ");
		String name = sc.nextLine();
		System.out.print("Enter the name of the Doctor you want to consult: ");
		String name = sc.nextLine();
		System.out.println("Enter the date of admittance of the Patient: ");
		System.out.print("Year: ");
		int y1 = sc.nextInt();
		System.out.print("Month: ");
		int m1 = sc.nextInt();
		System.out.print("Date: ");
		int d1 = sc.nextInt();
		System.out.println("Enter the date of release of the Patient: ");
		System.out.print("Year: ");
		int y2 = sc.nextInt();
		System.out.print("Month: ");
		int m2 = sc.nextInt();
		System.out.print("Date: ");
		int d2 = sc.nextInt();
		p[i] = new p(name, d, y1, m1, d1, y2, m2, d2);
	}
	
}
class Person
{
	String name;
	Date D;
	Person(String name, int y, int m, int d)
	{
		this.name = name;
		D = Date(y,m,d);
	}
}
class Patient extends Person
{
	Doctor d;
	int amount;
	boolean equal(Doctor t);
	Patient(Doctor d)
	{
		this.d = d;
		super(nam
	}
}
class Doctor extends Person
{
	String sp;
	int fees;
	int income;
	Doctor(String name, int y, int m, int d, String speciality, int fees)
	{
		super(name, y, m, d);
		sp = speciality;
		this.fees = fees;
		income = 0;
	}
	Doctor(String name)
	{
		this.name = name;
	}
}
