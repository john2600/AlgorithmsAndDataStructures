package com.datastructures.queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue {
    private int front;
    private int back;
    private Employee[] queue;

    public ArrayQueue(int capacity){
        queue = new Employee[capacity];
    }

    public void add(Employee employee){
        if(isFull()){
            Employee[] newArray = new Employee[queue.length * 2 ];
            System.arraycopy(queue,0 ,newArray,0, queue.length);
            queue = newArray;
        }
        queue[back] = employee;
        back++;
    }

    public Employee remove(){
        if(size()==0){
            throw new NoSuchElementException();
        }
        Employee employee = queue[front];
        queue[front] = null;
        front++;
        if(size()==0){
            front = 0;
            back = 0;
        }
        return employee;
    }

    public Employee peek(){
        if(size()==0){
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public void printQueue(){
        Arrays.stream(queue).forEach(i->System.out.println(i.toString()));
    }

    public int size(){
        return back - front;
    }

    public boolean isFull(){
        return back==queue.length;
    }
}
