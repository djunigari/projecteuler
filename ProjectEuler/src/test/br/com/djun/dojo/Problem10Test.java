package br.com.djun.dojo;

import org.junit.Assert;
import org.junit.Test;

/**
 The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

 Find the sum of all the primes below two million.
 */
public class Problem10Test {
    private Problem10 p;

    public Problem10Test(){
        p = new Problem10();
    }

    @Test
    public void getSumOfAllPrimesBelow(){
        Assert.assertEquals(17,p.getSumOfAllPrimesBelow(10));
    }
}
