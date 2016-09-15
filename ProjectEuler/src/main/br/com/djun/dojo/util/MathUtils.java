package br.com.djun.dojo.util;

public class MathUtils {

    public boolean isPrime(long number){
        if(number == 0 || number == 1){
            return false;
        }
        for(int i = 2 ; i < number; i++){
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
