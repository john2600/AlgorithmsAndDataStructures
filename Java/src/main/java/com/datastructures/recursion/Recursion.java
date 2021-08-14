package com.datastructures.recursion;

public class Recursion {

    public void head(int n){
        System.out.println("Calling the function with n="+n);

        if(n==0) return;

        head(n-1);

        System.out.println("The value n="+n);
    }

    public void tail(int n){
        System.out.println("Calling the function with n="+n);

        if (n==0) return;

        System.out.println("The value n="+n);

        tail(n-1);
    }

    public static void main(String[] args) {
        Recursion r = new Recursion();
        r.tail(5);
    }
}
