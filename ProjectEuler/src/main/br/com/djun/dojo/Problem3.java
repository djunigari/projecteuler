package br.com.djun.dojo;

import br.com.djun.dojo.util.MathUtils;

/**
 The prime factors of 13195 are 5, 7, 13 and 29.

 What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {
    public static void main(String[] args){
        System.out.println(new Problem3().getTheLargestPrimeFactor(600851475143l));
    }

    public long getTheLargestPrimeFactor(long number){
        if(number <= 1){
            return 0;
        }
        long largest = 0;
        long aux = number / 2; // ex: 50 = 1x50 2x25 5x10 -> 1,2,5,10,25,50
        for(long i = 1 ; i <= aux ; i++){
            if(number % i == 0){
                long div1 = i;
                long div2 = number / i;
                if(isPrime(div2)){
                    return div2;
                }
                if(isPrime(div1)){
                    largest = div1;
                }
            }
        }
        return largest;
    }

    public boolean isPrime(long number){
        long aux = number/2;
        for(long i = 2 ; i <= aux; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
