package com.datastructures.recursion;

public class Algorithm {

    public int sumIterative(int x){
        int result = 0;
        for (int i=1; i<=x; i++){
            result = result +i;
        }
        return result;
    }

    public int sumRecursive(int x){
        if(x==1) return 1;
        return x+sumIterative(x-1);
    }

    public static void main(String[] args) {
        Algorithm algorithm = new Algorithm();
        System.out.println(algorithm.sumIterative(5));
    }
}
