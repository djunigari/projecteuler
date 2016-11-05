package br.com.djun.dojo;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

 What is the sum of the digits of the number 2^1000?
 */
public class Problem15Test {

    private Problem15 p;

    public Problem15Test(){
        p = new Problem15();
    }

    @Test
    public void getSumOfNumeberFromExponent(){
        Assert.assertEquals(26, p.getSumOfNumeberFromExponent(15));
    }

    @Test
    public void getSumFromNumber(){
        Assert.assertEquals(26,p.getSumFromNumber(new BigDecimal("32768")));
    }
}
