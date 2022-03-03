function isRepeat(txt){
    var result = 1;

    if (txt <= 1){
        return result;
    }
    var count = 1;
    for(var i=0; i<txt.length-1; i++){
        if(txt[i] == txt[i+1]){
            count++;
            result = Math.max(count, result);
        }
        else{
            count = 1;
        }
    }
    return result;
}