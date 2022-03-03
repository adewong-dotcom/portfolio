function isParenthesis(str){
    const open = ["(", "[", "{"];
    const close = [")", "]", "}"];
    const myArray = str.split("");
    var count = myArray.length-1;
    if(myArray%2 != 0){
        return false;
    }

    for(var i=0; i<myArray.length; i++){
        const index = open.indexOf(myArray[i]);
        if(close[index] != myArray[i+1]  && close[index] != myArray[count]){
            return false;
        }
        if(close[index] == myArray[i+1]){
            i++;
        }
        if(close[index] == myArray[count] && count == myArray.length/2){
            break;
        }
        count--;
    }
    return true;
}

