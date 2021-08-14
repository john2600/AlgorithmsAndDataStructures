package com.datastructures.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John","Doe",1234));
        employeeList.add(new Employee("Jane","JOnes",1235));
        employeeList.add(new Employee("Greta","Smith",1236));

        employeeList.forEach(employee->System.out.println(employee));

        System.out.println(employeeList.get(1));

        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("Adam","Siderosky",12344));

        employeeList.forEach(employee->System.out.println(employee));

        Employee[] employees = employeeList.toArray(new Employee[employeeList.size()]);

        for(Employee employee: employees){
            System.out.println(employee.toString());
        }

        System.out.println(employeeList.contains(new Employee("John","Doe",1234)));

        employeeList.remove(2);
    }
}
