package com.datastructures.hashtable;

import java.util.*;

public class HashTableChallenge2 {
    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe Nuevo", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        Map<Integer,Employee> employeeHashMap = new HashMap<>();

        List<Employee> newEmployeeList = new ArrayList<>();

        employees.forEach(x->{
            Employee idEmployee = employeeHashMap.get(x.getId());
            if (idEmployee !=null && employeeHashMap.containsKey(x.getId())){
                employeeHashMap.remove(x.getId());
                newEmployeeList.add(idEmployee);
            }
            employeeHashMap.put(x.getId(), x);
        });

        for(Employee employee:newEmployeeList){
            employees.remove(employee);
        }

        employees.forEach(e -> System.out.println(e));
        //employeeHashMap.forEach((x,y)->System.out.println("key=> "+x+" value=>"+y));


//        int[] nums = new int[10];
//        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };
//        for (int i = 0; i < numsToAdd.length; i++) {
//            nums[hash(numsToAdd[i])] = numsToAdd[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }
}
