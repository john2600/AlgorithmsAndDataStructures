package com.datastructures.recursion;

public class TowersOfHanoi {
    public void hanoi(int disk, char source, char middle, char destination){
        if(disk==0){
            System.out.println("Plate "+disk+ " from "+ source+" to "+destination);
            return;
        }
        hanoi(disk-1, source, destination, middle);
        System.out.println("Plate "+disk+ " from "+ source+" to "+destination);
        hanoi(disk-1, middle, source, destination );
    }
}
