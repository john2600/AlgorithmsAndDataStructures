package com.datastructures.sort;

public class BubbleSort {
    private static void  swap(int [] arr, int i, int j){
        if (i==j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int [] sort(int [] elements) {
        for(int unsorted=elements.length-1; unsorted>0; unsorted--) {
            for(int i=1; i<unsorted; i++){
                if(elements[i]<elements[i-1]){
                    swap(elements, i, i-1);
                }
            }
        }
        return elements;
    }

}
