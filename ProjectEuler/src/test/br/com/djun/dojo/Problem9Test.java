package br.com.djun.dojo;

import org.junit.Assert;
import org.junit.Test;
/**
 A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

 aˆ2 + bˆ2 = cˆ2
 For example, 3ˆ2 + 4ˆ2 = 9 + 16 = 25 = 52.

 There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 Find the product abc.
 */
public class Problem9Test {
    private Problem9 p;

    public Problem9Test(){
        p = new Problem9();
    }
    @Test
    public void getProduct(){
        Assert.assertEquals(60,p.getProduct(12));
    }
}
