package br.com.djun.dojo;

import br.com.djun.dojo.util.MathUtils;

/**
 By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

 What is the 10 001st prime number?
 */
public class Problem7 {
    private MathUtils utils = new MathUtils();

    public static void main(String[] args){
        System.out.print(new Problem7().getPrimeOfPosition(10001));
    }

    public int getPrimeOfPosition(int n){
        int cont = 1;
        int prime = 2;
        int i = prime;
        while(cont <= n){
            if(utils.isPrime(i)){
                prime = i;
                cont++;
            }
            i++;
        }
        return prime;
    }
}
