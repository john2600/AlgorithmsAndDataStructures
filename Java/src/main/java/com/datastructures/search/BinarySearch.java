package com.datastructures.search;

public class BinarySearch {
    public int find(int [] elements, int n, int left, int right){
        if(right<left) return -1;

        int middleIndex = (left + right)/2;

        if(elements[middleIndex]==n)
            return middleIndex;

        if (elements[middleIndex]<n){
           return find(elements, n, middleIndex+1, right);
        } else {
            return find(elements, n, left- 1, middleIndex );
        }
    }

    public int findIterative(int[] input, int value){
        int start = 0;
        int end = input.length-1;


        while(start<end){
            int middle = start+end/2;
            if(input[middle]==value){
                return input[middle];
            } else if(input[middle]<value){
               start = middle+1;
            } else if(input[middle]>value){
                end = middle-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {1,3,4,6,10,11};
        BinarySearch binarySearch = new BinarySearch();
       System.out.println(binarySearch.find(nums, 10, 0,  nums.length));
       // System.out.println(binarySearch.findIterative(nums, 10));
    }
}
