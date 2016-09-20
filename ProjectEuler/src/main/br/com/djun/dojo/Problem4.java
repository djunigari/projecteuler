package br.com.djun.dojo;

import java.util.ArrayList;
import java.util.List;

/**
 A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

 Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {
    public static void main(String[] args){
        System.out.println(Math.pow(10,3)-1);
    }
    public void getLargestPalindrome(int size){
        int aux = (int)Math.pow(10, size)-1;
        for(int i = aux; i >= 0; i--){
            int number = createPalindrome(i);
            isProductByTwoNumbers(size,i);
        }
    }
    public int createPalindrome(int part1){
        String part2 = invertNumber(part1);
        return Integer.parseInt(String.valueOf(part1).concat(part2));
    }

    //1000 -> 0001
    //123 -> 321
    public String invertNumber(int n){
        String aux = String.valueOf(n);

        StringBuilder result = new StringBuilder();
        for(int i = aux.length()-1; i >= 0;i--){
            result.append(aux.charAt(i));
        }

        return result.toString();
    }

    public boolean isProductByTwoNumbers(int size, int n){

        return false;
    }


}
