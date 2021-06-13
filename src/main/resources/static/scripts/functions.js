function testFun(clickedId){
//    var yourUrl = "http://localhost:8080/home";
    console.log("czesc młocie");
    console.log(clickedId);
//    alert("clickedId");
//    document.write("something");
//    document.getElementById(clickedId).disabled = true;
//    alert(clickedId);
//    var xhr = new XMLHttpRequest();
//    xhr.open("POST", yourUrl, true);
//    xhr.setRequestHeader('Content-Type', 'application/json');
//    xhr.send(JSON.stringify({
//        value: document.getElementById(clickedId).name
//    }));
//    alert(document.getElementById(clickedId).name);
}

window.onload = function(){
//    alert("hello");
}

function tes(){
    alert("hello2");
}

document.addEventListener("DOMContentLoaded", function() {
//  alert("hello3");
//  document.write("something");
//    var img = document.createElement("img");
//    img.src = "/images/empty.png";
//    var src = document.getElementById("button00")
//    src.appendChild(img);
//    alert("${list[0][0]}")


    var but00 = document.getElementById("button00").textContent;
    var but01 = document.getElementById("button01").textContent;
    var but02 = document.getElementById("button02").textContent;
    var but10 = document.getElementById("button10").textContent;
    var but11 = document.getElementById("button11").textContent;
    var but12 = document.getElementById("button12").textContent;
    var but20 = document.getElementById("button20").textContent;
    var but21 = document.getElementById("button21").textContent;
    var but22 = document.getElementById("button22").textContent;

    alert("but00: " + but00 + " but01: " + but01 + " but02: " + but02 + "\n" + "but10: " + but10 + " but11: " + but11 + " but12: " + but12 + "\n" + "but20: " + but20 + " but21: " + but21 + " but22: " + but22);
    if(but00 == " "){
        alert("hhhhhhh")
    }


});