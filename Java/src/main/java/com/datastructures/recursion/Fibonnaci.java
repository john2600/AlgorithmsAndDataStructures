package com.datastructures.recursion;

import java.time.Duration;
import java.time.Instant;

public class Fibonnaci {

    public int head(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        int fibonnaci1 = head(n-1);
        int fibonacci2 = head(n-2);
        int result = fibonacci2 + fibonnaci1;
        return result;
    }

    public int tail(int n, int a, int b) {
        if(n==0) return a;
        if(n==1) return b;

        return tail(n-1,b,a+b);
    }

    public int tail(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return tail(n-1 ) + tail(n-2);
    }

    public static void main(String[] args) {
        Instant before = Instant.now();
        Fibonnaci fibonnaci = new Fibonnaci();
        System.out.println(fibonnaci.tail(8));
        //System.out.println(fibonnaci.tail(8,0,1));
        Instant after = Instant.now();
        long delta = Duration.between(before, after).getNano();
        System.out.println(delta + " duration in ns");
        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
        towersOfHanoi.hanoi(63,'A','B','C');
    }

}
