package br.com.djun.dojo;

import org.junit.Assert;
import org.junit.Test;

/**
 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5Test {
    private Problem5 p;

    public Problem5Test(){
        p = new Problem5();
    }

    @Test
    public void getLeastCommonMultiple(){
        Assert.assertEquals(2520,p.getLeastCommonMultiple(10));
    }

}
