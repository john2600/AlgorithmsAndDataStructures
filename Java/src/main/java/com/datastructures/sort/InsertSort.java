package com.datastructures.sort;

public class InsertSort {
    public static void main(String[] args) {
        int [] elements = {18,25,-15,5, 55, 60, -1,43};
        // -15, -1, 5, , 18, 25, 43, 55, 60
        insertSort(elements);

        for (int i=0; i<elements.length-1; i++){
            System.out.println(elements[i]);
        }
    }

    public static int [] insertSort(int [] elements) {
        for(int i=0; i<elements.length; i++){
            int nElement = elements[i];
            int j;
            for (j=i; j>0 && elements[i]>nElement; j--){
                elements[j]=elements[j-1];
            }
            elements[i] = nElement;

        }
        return elements;
    }
}
