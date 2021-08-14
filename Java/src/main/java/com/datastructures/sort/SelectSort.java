package com.datastructures.sort;

public class SelectSort {
    public static void main(String[] args) {
        int [] elements = {18,25,-15,5, 55, 60, -1,43};
        // -15, -1, 5, , 18, 25, 43, 55, 60
        int[] result = selectSort(elements);

        System.out.println(result);
        for (int i=0; i<result.length-1; i++){
            System.out.println(elements[i]);
        }
    }

    public static int [] selectSort(int [] elements) {
        for (int i= elements.length-1; i>0; i--){
            int largest = 0;
            for (int j = 1; j<=i; j++){
                if (elements[j]>elements[largest]){
                    largest = j;
                }
                swap(elements, largest, i);
            }
        }
        return elements;
    }

    private static void  swap(int [] arr, int i, int j){
        if (i==j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
