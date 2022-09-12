// mouse events
function button(){
    alert("Hello User! You Have Single Clicked.");
}

function button1(){
    alert("Hello User! You Have Double Clicked.");
}

function button2(){
    alert("Hello User! Your Mouse is entered.");
}

function button3(){
    alert("Hello User");
}

function button4(){
    alert("Hello User");
}

function button5(){
    alert("Hello User");
}

function button6(){
    alert("Hello User");
}

function button7(){
    alert("Hello User");
}

function button8(){
    alert("Hello User");
}

function button9(){
    alert("Hello User");
}



// keyboard events
function keyDown(){
    alert("Key Pressed");
}

function keyUp(){
    alert("Key Pressed");
}

function onFocus(){
    console.log("On Focus");
}

function onBlur(){
    console.log("On Blur");
}

function onChange(){
    console.log("On Change");
}



// eventListener
function button10(){
    let x = document.getElementById("gender").value;
    alert("Gender You Have Selected Is: " + x);
}
document.getElementById("gender").addEventListener("change", button10);


function button11(){
    let x = document.getElementById("my1").value;
    x=5;
    console.log("Gender You Have Selected Is: " + x);
}
document.getElementById("my1").addEventListener("keydown", button11);


// change color of paragraph
function changeParagraphColor() {
    document.getElementById("paraColorChange").style.color = "blue";
}