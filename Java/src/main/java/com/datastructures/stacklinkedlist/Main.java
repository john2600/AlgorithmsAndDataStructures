package com.datastructures.stacklinkedlist;

public class Main {
    public static void main(String[] args) {
       Employee employeeJohn = new Employee("John","Doe",1234);
       Employee employeeJane = new Employee("Jane","JOnes",1235);
       Employee employeeGreta = new Employee("Greta","Smith",1236);

       StackLinkedList stackLinkedList = new StackLinkedList();

       stackLinkedList.push(employeeGreta);
       stackLinkedList.push(employeeJohn);
       stackLinkedList.push(employeeJane);

       stackLinkedList.printStack();

       System.out.println(stackLinkedList.pop());

       stackLinkedList.printStack();

       System.out.println(stackLinkedList.peek());

       System.out.println(stackLinkedList.peek());

       stackLinkedList.printStack();

    }
}
