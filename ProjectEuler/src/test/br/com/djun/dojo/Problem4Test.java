package br.com.djun.dojo;

import org.junit.Assert;
import org.junit.Test;

/**
 A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

 Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4Test {
    private Problem4 p;

    public Problem4Test(){
        p = new Problem4();
    }

    @Test
    public void getLargestPalindrome(){
        Assert.assertEquals(9009,p.getLargestPalindrome(2));
    }

    @Test
    public void createPalindrome(){
        Assert.assertEquals(123321l,p.createPalindrome(123));
        Assert.assertEquals(100001l,p.createPalindrome(100));
        Assert.assertEquals(11l,p.createPalindrome(001));
    }

    @Test
    public void invertNumber(){
        Assert.assertEquals("1",p.invertNumber(0001));
        Assert.assertEquals("1",p.invertNumber(1));
        Assert.assertEquals("123",p.invertNumber(321));
        Assert.assertEquals("0001",p.invertNumber(1000));
    }


    @Test
    public void isProductByTwoNumbersWithSize(){
        Assert.assertTrue(p.isProductByTwoNumbersWithSize(1,1));
        Assert.assertTrue(p.isProductByTwoNumbersWithSize(1,10));
        Assert.assertTrue(p.isProductByTwoNumbersWithSize(2,100));
        Assert.assertTrue(p.isProductByTwoNumbersWithSize(2,9009));
    }

    @Test
    public void isNotProductByTwoNumbersWithSize(){
        Assert.assertFalse(p.isProductByTwoNumbersWithSize(2,10));
        Assert.assertFalse(p.isProductByTwoNumbersWithSize(3,10));
    }
}
