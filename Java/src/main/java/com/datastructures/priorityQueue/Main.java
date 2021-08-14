package com.datastructures.priorityQueue;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(26);
        priorityQueue.add(-22);
        priorityQueue.add(1343);
        priorityQueue.add(54);
        priorityQueue.add(0);
        priorityQueue.add(-3492);
        priorityQueue.add(429);

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());

        Object[] ints = priorityQueue.toArray();

        for(Object nums:ints){
            System.out.println(nums);
        }


        System.out.println(priorityQueue.remove(54));
        System.out.println(priorityQueue.peek());
        priorityQueue.add(-1);
        System.out.println(priorityQueue.peek());
    }



}
