package com.datastructures.singlelinkedlists;

public class Main {
    public static void main(String[] args) {
       Employee employee1 = new Employee("John","Doe", 1);
       Employee employee2 = new Employee("Wilson","Williams", 2);
       Employee employee3 = new Employee("Pepe","Perez", 4);
        Employee employee4 = new Employee("Maria","Patty", 0);
        Employee employee5 = new Employee("Test","Prueba", 3);
        EmployeeLinkedListChallenge list = new EmployeeLinkedListChallenge();
        //list.addToFront(employee1);
        //list.addToFront(employee2);
        //list.addToFront(employee3);

        list.insertSorted(employee1);
        list.insertSorted(employee2);
        list.insertSorted(employee3);
        list.insertSorted(employee4);
        list.insertSorted(employee5);
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());

        System.out.println("imprimiendo :");
        list.printList();
        //list.removeFromFront();
        System.out.println(list.getSize());

        //list.printList();
    }
}
