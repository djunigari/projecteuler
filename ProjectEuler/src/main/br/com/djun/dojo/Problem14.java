package br.com.djun.dojo;

import java.util.ArrayList;
import java.util.List;

/**
 The following iterative sequence is defined for the set of positive integers:

 n → n/2 (n is even)
 n → 3n + 1 (n is odd)

 Using the rule above and starting with 13, we generate the following sequence:

 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

 Which starting number, under one million, produces the longest chain?

 NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class Problem14 {
    public static void main(String[] args){
        System.out.println(new Problem14().getTheLongestChain(1000000));
    }

    public long getTheLongestChain(long n){;
        List<Long> longestList = new ArrayList<>();
        List<Long> list = null;
        for(long i = n; i > 1 ; i --){

            list = getList(i);
            if(longestList.size() < list.size()){
                longestList = list;
            }
        }
        return longestList.get(0);
    }

    public List<Long> getList(long n){
        List<Long> list = new ArrayList<>();
        list.add(n);
        while(n > 1){
            if(n % 2 == 0){
                list.add(n = n/2);
            }else{
                list.add(n = 3*n + 1);
            }
        }
        return list;
    }
}
