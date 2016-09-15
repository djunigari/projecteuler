package br.com.djun.dojo;

import br.com.djun.dojo.util.MathUtils;

/**
 The prime factors of 13195 are 5, 7, 13 and 29.

 What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {
    private MathUtils mathUtils;

    public Problem3(){
        mathUtils = new MathUtils();
    }

    public static void main(String[] args){
        System.out.println(new Problem3().getTheLargestPrimeFactor(600851475143l));
    }

    public long getTheLargestPrimeFactor(long number){
        if(number <= 1){
            return 0;
        }
        long largest = 0;
        for(int i = 1 ; i <= number ; i++){
            if(mathUtils.isDivided(number,i) && mathUtils.isPrime(i)){
                largest = i;
            }
        }
        return largest;
    }

}
