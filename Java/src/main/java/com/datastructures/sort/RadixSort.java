package com.datastructures.sort;

public class RadixSort {
    public static void main(String[] args) {
        int [] radix  = { 4725, 4826, 1330, 8792, 1594, 5729};
        radixSort(radix, 10, 4);
        for (int value:radix){
            System.out.println(value);
        }
    }

    public static void radixSort(int[] input, int radix, int width){
        for(int i=0; i<width; i++){
            radixSingleSort(input, i, radix);
        }

    }

    private static void radixSingleSort(int[] input, int position, int radix) {
            int numItems = input.length;
            int [] countArray = new int[radix];
            for (int value:input){
                countArray[getDigit(position,value,radix)]++;
            }
            for(int i= 1; i<radix; i++){
                countArray[i] +=countArray[i-1];
            }

            int[] temp = new int[numItems];
            for (int tempIndex=numItems-1; tempIndex>=0; tempIndex--){
                temp[--countArray[getDigit(position,input[tempIndex], radix)]] = input[tempIndex];
            }

            for(int tempIndex=0; tempIndex<numItems; tempIndex++){
                input[tempIndex] = temp[tempIndex];
            }
    }

    private static int getDigit(int position, int value, int radix) {
        return value/(int)Math.pow(radix,position)%radix;
    }
}
