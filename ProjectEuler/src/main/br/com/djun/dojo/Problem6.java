package br.com.djun.dojo;

/**
 The sum of the squares of the first ten natural numbers is,

 1^2 + 2^2 + ... + 10^2 = 385
 The square of the sum of the first ten natural numbers is,

 (1 + 2 + ... + 10)^2 = 552 = 3025
 Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

 Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6 {

    public static void main(String[] args){
        System.out.println(new Problem6().getDifference(100));
    }

    public int getDifference(int n){
        return this.getSquareOfSum(n)-this.getSumOfSquares(n);
    }

    public int getSumOfSquares(int n){
        int result = 0;
        for(int i = 1; i<=n;i++){
            result += (int) Math.pow(i, 2);
        }
        return result;
    }

    public int getSquareOfSum(int n){
        int result = 0;
        for(int i = 1; i<=n;i++){
            result += i;
        }
        return (int) Math.pow(result, 2);
    }
}
