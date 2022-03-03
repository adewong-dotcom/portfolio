function palindromo(num){
    if(num < 0){ // Base case
        return false;
    }
    const number = num.toString().split("");
    var j=number.length-1;
    for(var i=0; i<number.length/2; i++){
        if(number[i]!=number[j]){
            return false;
        }
        j--;
    }
    return true;
}