package br.com.djun.dojo.util;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilsTest {
    private MathUtils utils;

    public MathUtilsTest(){
        utils = new MathUtils();
    }

    @Test
    public void isDivided(){
        Assert.assertTrue(utils.isDivided(10,2));
        Assert.assertTrue(utils.isDivided(10,5));
        Assert.assertTrue(utils.isDivided(10,1));
        Assert.assertTrue(utils.isDivided(10,10));
    }

    @Test
    public void isNotDivided(){
        Assert.assertFalse(utils.isDivided(10,0));
        Assert.assertFalse(utils.isDivided(10,3));
        Assert.assertFalse(utils.isDivided(10,6));
        Assert.assertFalse(utils.isDivided(10,8));
    }

    @Test
    public void isPrime(){
        Assert.assertTrue(utils.isPrime(2));
        Assert.assertTrue(utils.isPrime(5));
        Assert.assertTrue(utils.isPrime(7));
    }

    @Test
    public void isNotPrime(){
        Assert.assertFalse(utils.isPrime(0));
        Assert.assertFalse(utils.isPrime(1));
        Assert.assertFalse(utils.isPrime(6));
        Assert.assertFalse(utils.isPrime(10));
    }
}
