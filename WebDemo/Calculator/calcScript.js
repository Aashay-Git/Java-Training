let display = document.getElementById("display")
display.value = 0

function buttonPress(button){
    // const n = 
    console.log("Button pressed")
    console.log(button)
}

function appendValue(value){
    display.value += value
}

function backspace(){
    display.value = display.value.substring(0, display.value.length - 1);
}

function clearValue(){
    console.log("Cleared")
    display.value = ""
}

function calculate(){
    try{
        display.value = eval(display.value)
    }catch(error){
        display.value = "Invalid"
        console.log(error)
    }
}