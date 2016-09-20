package br.com.djun.dojo.util;

import java.util.ArrayList;
import java.util.List;

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

    public List<Integer> getDivisors(int n){
        List<Integer> list = new ArrayList<>();
        for(int i = 2; n > 1; i++){
            while(n % i == 0){
                list.add(i);
                n = n/i;
            }
        }
        return list;
    }
}
