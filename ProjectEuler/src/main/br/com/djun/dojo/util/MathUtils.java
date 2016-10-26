package br.com.djun.dojo.util;

import java.util.*;

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

    public Map<Integer,Integer> getDivisors(long n){
        Map<Integer,Integer> list = new HashMap<>();
        list.put(1,1);
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

    public long getAmountDivisors(long number){
        Map<Integer, Integer> divisors = getDivisors(number);
        long result = 1;
        divisors.remove(1);
        for(Map.Entry<Integer, Integer> e :divisors.entrySet()){
            result *=e.getValue()+1;
        }
        return result;
    }
}
