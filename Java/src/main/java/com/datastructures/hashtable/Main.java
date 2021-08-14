package com.datastructures.hashtable;

public class Main {
    public static void main(String[] args) {
       Employee employeeJohn = new Employee("John","Doe", 1);
       Employee employeeWilson = new Employee("Wilson","Williams", 2);
        Employee employeePepe = new Employee("Pepe","Perez", 3);
        Employee employeeGreta = new Employee("Greta","Andrew", 4);
        Employee employeeAndrej = new Employee("Andrej","Soroski", 5);
        Employee employeeCarl = new Employee("Carl","Kent", 6);

        SimpleHashTable simpleHashTable = new SimpleHashTable();
        simpleHashTable.put("John", employeeJohn);
        simpleHashTable.put("PepePerez", employeePepe);
        simpleHashTable.put("Wilson", employeeWilson);
        simpleHashTable.put("Greta", employeeGreta);
        simpleHashTable.put("Andrej", employeeAndrej);
        simpleHashTable.put("Carl", employeeCarl);

        simpleHashTable.printHashTable();

        System.out.println(simpleHashTable.get("John"));
        System.out.println(simpleHashTable.get("PepePerez"));
        System.out.println(simpleHashTable.get("Carl"));


        simpleHashTable.remove("John");
        simpleHashTable.remove("Carl");
        simpleHashTable.remove("PepePerez");
        simpleHashTable.remove("Wilson");
        simpleHashTable.remove("Greta");
        System.out.println();

        simpleHashTable.printHashTable();
    }
}
