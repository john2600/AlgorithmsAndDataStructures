package com.datastructures.search;
/*
public class LinearSearch {
    public int find(int [] elements, int n){
        for (int i=0; i<elements.length; i++){
            if (elements[i]==n){
                return i;
            }
        }
        return -1;
    }

    public int recursion(int [] elements, int n, int index){
        if(elements[index]==n) return index;
        index = index-1;

        if (index<0) return -1;
        return recursion(elements, n, index);
    }

    public int recursiveFind(int[] container, int item, int index) {
        // search miss
        if(index >= container.length) return -1;

        // base case when we find the item
        if(container[index] == item) return index;

        return recursiveFind(container, item, index+1);
    }

    public static void main(String[] args) {
        int [] nums = {1,3,4,6,10,11};
        LinearSearch linearSearch = new LinearSearch();
        //System.out.println(linearSearch.find(nums, 6));
        System.out.println(linearSearch.recursion(nums, 3, nums.length-1));
    }
}

*/
