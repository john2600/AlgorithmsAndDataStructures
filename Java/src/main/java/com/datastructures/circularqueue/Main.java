package com.datastructures.circularqueue;

public class Main {
    public static void main(String[] args) {

        Employee employeeJohn = new Employee("John","Doe", 1);
        Employee employeeWilson = new Employee("Wilson","Williams", 2);
        Employee employeePepe = new Employee("Pepe","Perez", 3);
        Employee employeeGreta = new Employee("Greta","Andrew", 4);
        Employee employeeAndrej = new Employee("Andrej","Soroski", 5);
        Employee employeeCarl = new Employee("Carl","Kent", 6);


        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.add(employeeJohn);
        circularQueue.add(employeeWilson);
        //circularQueue.add(employeePepe);
       //ircularQueue.add(employeeGreta);
        System.out.println();
       // circularQueue.remove();;
       // circularQueue.add(employeeGreta);
       // circularQueue.remove();
       // circularQueue.add(employeePepe);
       // circularQueue.remove();
       // circularQueue.add(employeeCarl);
       // circularQueue.remove();
       // circularQueue.add(employeeCarl);
       // circularQueue.remove();
        System.out.println();
        circularQueue.printQueue();

    }
}

