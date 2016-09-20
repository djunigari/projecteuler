package br.com.djun.dojo.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

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

    @Test
    public void getDivisors(){
        List<Integer> list = utils.getDivisors(10);

        Assert.assertEquals(2,list.get(0).intValue());
        Assert.assertEquals(5,list.get(1).intValue());

        list = utils.getDivisors(100);

        Assert.assertEquals(2,list.get(0).intValue());
        Assert.assertEquals(2,list.get(1).intValue());
        Assert.assertEquals(5,list.get(2).intValue());
        Assert.assertEquals(5,list.get(3).intValue());
    }
}
