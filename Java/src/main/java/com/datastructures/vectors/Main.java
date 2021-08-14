package com.datastructures.vectors;

import com.datastructures.arrayLists.Employee;

import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<com.datastructures.arrayLists.Employee> employeeList = new Vector<>();
        employeeList.add(new com.datastructures.arrayLists.Employee("John","Doe",1234));
        employeeList.add(new com.datastructures.arrayLists.Employee("Jane","JOnes",1235));
        employeeList.add(new Employee("Greta","Smith",1236));
    }
}

