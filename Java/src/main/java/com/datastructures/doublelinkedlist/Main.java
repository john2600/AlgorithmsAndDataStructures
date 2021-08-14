package com.datastructures.doublelinkedlist;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John","Doe", 1);
        Employee employee2 = new Employee("Wilson","Williams", 2);
        Employee employee3 = new Employee("Pepe","Perez", 3);

        EmployeeDoubleLinkedList linkedList = new EmployeeDoubleLinkedList();
        linkedList.addToFront(employee1);
        linkedList.addToFront(employee2);
        linkedList.addToFront(employee3);

        System.out.println(linkedList.getSize());

        linkedList.printList();

        Employee employee4 = new Employee("Andy", "Tonsom",4);
        linkedList.addToEnd(employee4);

        System.out.println(linkedList.getSize());
        linkedList.printList();

        linkedList.removeFromFront();
        System.out.println(linkedList.getSize());
        linkedList.printList();

        linkedList.removeFromEnd();
        System.out.println(linkedList.getSize());
        linkedList.printList();
    }
}
