package br.com.djun.dojo;

import org.junit.Assert;
import org.junit.Test;

/**
 By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

 What is the 10 001st prime number?
 */
public class Problem7Test {
    private Problem7 p;

    public Problem7Test(){
        p = new Problem7();
    }

    @Test
    public void getPrimeOfPosition(){
        Assert.assertEquals(2,p.getPrimeOfPosition(1));
        Assert.assertEquals(13,p.getPrimeOfPosition(6));
    }
}
