package com.datastructures.stacklinkedlist;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class StackLinkedList {
    private LinkedList<Employee> stack;
    public StackLinkedList(){
        stack = new LinkedList<>();
    }
    public void push(Employee employee){
        stack.push(employee);
    }

    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
      return stack.pop();
    }

    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.peek();
    }

    public void printStack(){
        stack.stream().forEach(i->System.out.println(i.toString()));
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
