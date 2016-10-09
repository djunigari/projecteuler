package br.com.djun.dojo.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Map<Integer,Integer> getDivisors(int n){
        Map<Integer,Integer> list = new HashMap<>();
        for(int i = 2; n > 1; i++){
            int count = 0;
            while(n % i == 0){
                count++;
                n = n/i;
            }
            if(count > 0){
                list.put(i,count);
            }
        }
        return list;
    }
}
