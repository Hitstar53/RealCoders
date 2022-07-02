var index=0
var imgList=["img1.png","img2.jfif","img3.jfif"]

function change(){
    index=index+1
    if(index==imgList.length){
        index=0
    }
    console.log(1)
    image=document.getElementById("wkd")
    image.src=imgList[index]
}
function changeb(){
    
    if(index==0){
        index=imgList.length
    }
    index=index-1
    console.log(1)
    image=document.getElementById("wkd")
    image.src=imgList[index]
}