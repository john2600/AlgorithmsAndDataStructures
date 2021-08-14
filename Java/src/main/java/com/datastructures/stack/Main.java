package com.datastructures.stack;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee("John","Doe",1234));
        stack.push(new Employee("Jane","JOnes",1235));
        stack.push(new Employee("Greta","Smith",1236));
        System.out.println();
        System.out.println(stack.pop());
        System.out.println();
        System.out.println(stack.peek());
        System.out.println();
        stack.printStack();
        System.out.println();
        System.out.println(stack.peek());
        System.out.println();
        stack.printStack();
        System.out.println();
    }
}
