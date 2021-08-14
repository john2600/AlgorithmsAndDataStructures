package com.datastructures.sort;

public class CountingSort {
    public static void main(String[] args) {
        int [] elements = {5,2,7,8, 9, 2, 8, 7, 10, 3, 4};
        // -15, -1, 5, , 18, 25, 43, 55, 60
        countingSort(elements, 1, 11);

        System.out.println(elements);
        for (int i=0; i<elements.length-1; i++){
            System.out.println(elements[i]);
        }
    }

    public static void countingSort(int[] input, int min, int max){
        int[] countArray = new int[(max-min)+1];

        for (int i=0; i<input.length; i++){
            countArray[input[i]-min]++;
        }

        int j=0;
        for(int i=min; i<=max; i++){
            while(countArray[i-min]>0){
                input[j++]=i;
                countArray[i-min]--;
            }
        }
    }
}
