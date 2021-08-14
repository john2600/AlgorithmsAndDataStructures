package com.datastructures.sort;

public class RadixSortChallenge3 {
    public static void main(String[] args) {
        String [] radix  = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
        radixSort(radix, 26, 5);

        for (String value:radix){
            System.out.println(value);
        }
    }

    public static void radixSort(String[] input, int radix, int width){
        for(int i=width-1; i>=0; i--){
            radixSingleSort(input, i, radix);
        }

    }

    private static void radixSingleSort(String[] input, int position, int radix) {
        int numItems = input.length;
        int [] countArray = new int[radix];
        for (String value:input){
            countArray[getIndex(position,value)]++;
        }
        for(int i= 1; i<radix; i++){
            countArray[i] +=countArray[i-1];
        }

        String[] temp = new String[numItems];
        for (int tempIndex=numItems-1; tempIndex>=0; tempIndex--){
            temp[--countArray[getIndex(position,input[tempIndex])]] = input[tempIndex];
        }

        for(int tempIndex=0; tempIndex<numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }
    }

    private static int getDigit(int position, int value, int radix) {
        return value/(int)Math.pow(radix,position)%radix;
    }

    public static int getIndex(int position, String value){
        return value.charAt(position) - 'a';
    }
}
