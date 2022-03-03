function sumarUno(numero){
    var ultimo = numero[numero.length-1];
    let i = numero.length-1;
    if(ultimo < 9){
        numero[i] = ultimo+1;
        return numero;
    }
    if (numero[0] != 9) {
        while(i!=0){
            if(numero[i]==10){
                numero[i] = 0;
                numero[i-1] += 1;
                i--;
            }
            else{
                return numero;
            }
        }

    }
    else{
        while(i!=0){
            const numeroTwo = [1];
            if(numero[i]==10){
                numero[i] = 0;
                numero[i-1] += 1;
                i--;
            }
            else{
                break;
            }
        }
        const result = numeroTwo.concat(numero);
        return result;
    }
}