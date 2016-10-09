package br.com.djun.dojo;

import org.junit.Assert;
import org.junit.Test;

/**
 The sum of the squares of the first ten natural numbers is,

 1^2 + 2^2 + ... + 10^2 = 385
 The square of the sum of the first ten natural numbers is,

 (1 + 2 + ... + 10)^2 = 552 = 3025
 Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

 Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6Test {
    private Problem6 p;

    public Problem6Test(){
        p = new Problem6();
    }

    @Test
    public void getDifference(){
        Assert.assertEquals(2640,p.getDifference(10));

    }
    @Test
    public void getSumOfSquares(){
        Assert.assertEquals(385,p.getSumOfSquares(10));
    }

    @Test
    public void getSquareOfSum(){
        Assert.assertEquals(3025,p.getSquareOfSum(10));
    }
}
