package br.com.djun.dojo;

import br.com.djun.dojo.util.MathUtils;

import java.util.HashMap;
import java.util.Map;

/**
 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 {
    private MathUtils utils = new MathUtils();

    public static void main(String[] args){
        System.out.println(new Problem5().getLeastCommonMultiple(20));

    }

    public int getLeastCommonMultiple(int n){
        Map<Integer,Integer> list = new HashMap<>();
        for(int i = n ; i > 1; i--){
            Map<Integer, Integer> divisors = utils.getDivisors(i);
            for (Map.Entry<Integer, Integer> e : divisors.entrySet()) {
                if(list.containsKey(e.getKey())){
                    if(list.get(e.getKey()).intValue() >= e.getValue()){
                        continue;
                    }
                }
                list.put(e.getKey(),e.getValue());
            }
        }
        int result = 1;
        for (Map.Entry<Integer, Integer> e : list.entrySet()) {
            result *= (int)Math.pow(e.getKey(), e.getValue());
        }

        return result;
    }
}
