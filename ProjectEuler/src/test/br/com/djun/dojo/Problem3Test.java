package br.com.djun.dojo;

import org.junit.Assert;
import org.junit.Test;

/**
 The prime factors of 13195 are 5, 7, 13 and 29.

 What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3Test {
    private Problem3 problem3;

    public Problem3Test(){
        problem3 = new Problem3();
    }

    @Test
    public void getTheLargestPrimeFactor(){
        Assert.assertEquals(29,problem3.getTheLargestPrimeFactor(13195));
    }

}
