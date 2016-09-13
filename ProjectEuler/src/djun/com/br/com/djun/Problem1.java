package djun.com.br.com.djun;

/**
 If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

 Find the sum of all the multiples of 3 or 5 below 1000.
 **/
public class Problem1 {
    public static void main(String[]  args){
        System.out.println(new Problem1().sumMultiplesOf3and5(1000));
    }

    public long sumMultiplesOf3and5(long number){
        long totaly = 0;
        for(int i = 1 ; i < number;i++){
            if( i % 3 == 0 || i % 5 == 0) {
                totaly += i;
                continue;
            }
        }
        return totaly;
    }
}