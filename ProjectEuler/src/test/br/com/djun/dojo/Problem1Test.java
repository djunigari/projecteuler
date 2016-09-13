package br.com.djun.dojo;

import org.junit.Assert;
import org.junit.Test;

/**
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    Find the sum of all the multiples of 3 or 5 below 1000.
 **/
public class Problem1Test {
    private Problem1 problem1;

    public Problem1Test(){
        problem1 = new Problem1();
    }

    @Test
    public void sumWithNumber1(){
        Assert.assertEquals(0,problem1.sumMultiplesOf3and5(1));
    }

    @Test
    public void sumWithNumber10(){
        // 3, 5, 6, 9
        Assert.assertEquals(23,problem1.sumMultiplesOf3and5(10));
    }

    @Test
    public void sumWithNumber11(){
        // 3, 5, 6, 9, 10
        Assert.assertEquals(33,problem1.sumMultiplesOf3and5(11));
    }

    @Test
    public void sumWithNumber12(){
        // 3, 5, 6, 9, 10
        Assert.assertEquals(33,problem1.sumMultiplesOf3and5(12));
    }
}
