package br.com.djun.dojo;
/**
 A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

 aˆ2 + bˆ2 = cˆ2
 For example, 3ˆ2 + 4ˆ2 = 9 + 16 = 25 = 52.

 There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 Find the product abc.
 */


/**
 c = 997, b = 2 ; a = 1

 c = 996, b = 3 ; a = 1

 c = 995, b = 3 ; a = 2
 c = 995, b = 4 ; a = 1

 c = 994, b = 4 ; a = 2
 c = 994, b = 5 ; a = 1

 c = 993, b = 4 ; a = 3
 c = 993, b = 5 ; a = 2
 c = 993, b = 6 ; a = 1

 c = 992, b = 5 ; a = 3
 c = 992, b = 6 ; a = 2
 c = 992, b = 7 ; a = 1

 c = 991, b = 5 ; a = 4
 c = 991, b = 6 ; a = 3
 c = 991, b = 7 ; a = 2
 c = 991, b = 8 ; a = 1
 */
public class Problem9 {
    public static void main(String[] args){
        System.out.println(new Problem9().getProduct(1000));
    }
    public long getProduct(int n){
        long result = 0;

        int a = 1;
        int b = 2;
        int c = n- a - b;

        while(c > b){
            b = n - c -1;
            a = 1;
            if(b > c){
                b = c - 1;
                a = n - c - b;
            }
            while(b > a){
                a++;
                b--;
                if((a*a + b*b) == c*c){
                    return a*b*c;
                }
            }
            c--;
        }

        return result;
    }
}
