package com.datastructures.chain;


public class Main {
    public static void main(String[] args) {
        Employee employeeJohn = new Employee("John","Doe", 1);
        Employee employeeWilson = new Employee("Wilson","Williams", 2);
        Employee employeePepe = new Employee("Pepe","Perez", 3);
        Employee employeeGreta = new Employee("Greta","Andrew", 4);
        Employee employeeAndrej = new Employee("Andrej","Soroski", 5);
        Employee employeeCarl = new Employee("Carl","Kent", 6);

        ChainedHashTable chained = new ChainedHashTable();
        chained.put("John", employeeJohn);
        chained.put("Wilson", employeeWilson);
        chained.put("Pepe", employeePepe);
        chained.put("Greta", employeeGreta);

        chained.printHashTable();

        System.out.println("Retrieve key Smith: "+chained.get("John"));
        System.out.println("Before remove");
        chained.remove("Wilson");
        chained.remove("Pepe");


        System.out.println("After remove");
        chained.printHashTable();
    }


}
