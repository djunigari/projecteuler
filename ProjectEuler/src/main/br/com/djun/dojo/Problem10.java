package br.com.djun.dojo;

import br.com.djun.dojo.util.MathUtils;

/**
 The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

 Find the sum of all the primes below two million.
 */
public class Problem10 {
    public static void main(String[] args){
        System.out.println(new Problem10().getSumOfAllPrimesBelow(2000000));
    }

    public long getSumOfAllPrimesBelow(int n){
        long result = 2;
        int[] list = new int[n];
        for(int i = 3 ; i < n ;i+=2){
            list[i-1] = i;
        }

        for(int i = 0 ; i < n ; i++){
            if(list[i] != 0){
                for(int j = list[i]-1+list[i]; j < n;j+=list[i]){
                    list[j] = 0;
                }
            }
        }
        for(int i :list){
            result += i;
        }
        return result;
    }

}
