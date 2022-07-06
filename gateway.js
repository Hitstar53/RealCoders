alert("Hi,welcome to Mumbai!");
var pics=
[
  "gateway1.png",
  "gateway2.png",
  "gateway3.png",
  "gateway4.png"
];

var btn=document.querySelector("button");
var img=document.querySelector("img");
var ctr=1;
btn.addEventListener("click",function(){
if(ctr===4)                                                  
{
ctr=0;
}
img.src=pics[ctr];
ctr=ctr+1;
});
}

