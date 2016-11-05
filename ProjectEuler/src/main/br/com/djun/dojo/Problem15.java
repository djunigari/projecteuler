package br.com.djun.dojo;

import java.math.BigDecimal;


/**
 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

 What is the sum of the digits of the number 2^1000?
 */
public class Problem15 {
    public static void main(String[] args){
        System.out.println(new Problem15().getSumOfNumeberFromExponent(1000));
    }

    public long getSumOfNumeberFromExponent(int n){
        return getSumFromNumber(new BigDecimal("2").pow(n));
    }

    public long getSumFromNumber(BigDecimal n){
        String number = n.toString();
        long result = 0;
        for(int i = 0; i < number.length(); i++){
            result += Long.parseLong(String.valueOf(number.charAt(i)));
        }
        return result;
    }
}
