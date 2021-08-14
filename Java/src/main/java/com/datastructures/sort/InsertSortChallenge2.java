package com.datastructures.sort;

public class InsertSortChallenge2 {
    public static void main(String[] args) {
        int [] elements = {18,25,-15,5, 55, 60, -1,43};
        // -15, -1, 5, , 18, 25, 43, 55, 60
        //int [] result = insertSort(elements);

        insertSortRecursion(elements, elements.length-1);

        for (int i=0; i<elements.length; i++){
            System.out.println(elements[i]);
        }
    }

    public static int [] insertSort(int [] elements) {
        for(int i=1; i<elements.length; i++){
            int nElement = elements[i];
            int j;
            for (j=i; j>0 && elements[j-1]>nElement; j--){
                elements[j]=elements[j-1];
            }
            elements[j] = nElement;
        }
        return elements;
    }

    public static void insertSortRecursion(int [] elements, int i) {
        if(i<2){
            return;
        }
        insertSortRecursion(elements, i-1);
        int nElement = elements[i-1];
        int j;
        for (j = i-1; j > 0 && elements[j - 1] > nElement; j--) {
                elements[j] = elements[j - 1];
        }
        elements[j] = nElement;

    }
}
