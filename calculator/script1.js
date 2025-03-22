let entervl = document.getElementById("enter")
function display(num){
    entervl.value += num;
}
function equal() {
    try {
        entervl.value = eval(entervl.value);
    } catch (err) {
        alert ("Error!...");
    }
}
function clear1(){
    entervl.value=  "";
}

function del(){
    entervl.value=entervl.value.slice(0,-1);
}



