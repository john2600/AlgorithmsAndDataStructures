package com.datastructures.recursion;
import java.time.*;

public class Factorial {
    public static int factorial(int num) {
        if(num==0){
            return 1;
        }else {
            return num * factorial(num-1);
        }
    }
    public static int head(int n){
        if(n==1) return 1;

        int res = head(n-1);
        int result = res*n;
        return result;
    }

    public static int tail(int n, int accumulator){
        if (accumulator==0) return accumulator;
        return tail(n-1, n*accumulator);
    }
    public static void main(String[] args) {
        Instant before = Instant.now();
        System.out.println(factorial(7));
        Instant after = Instant.now();
        long delta = Duration.between(before, after).getNano();
        System.out.println(delta + " duration in ns");
    }
}
