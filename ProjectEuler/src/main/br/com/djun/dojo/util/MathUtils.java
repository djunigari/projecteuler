package br.com.djun.dojo.util;

public class MathUtils {

    public boolean isPrime(long number){
        if(number == 0 || number == 1){
            return false;
        }
        long aux = number/2;
        for(long i = 2 ; i <= aux; i++){
            if(isDivided(number,i)){
                return false;
            }
        }
        return true;
    }

    public boolean isDivided(long number, long divider){
        if(divider == 0){
            return false;
        }
        if(number % divider == 0){
            return true;
        }
        return false;
    }
}
