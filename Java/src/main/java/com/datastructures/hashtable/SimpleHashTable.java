package com.datastructures.hashtable;

public class SimpleHashTable {
    private StoreEmployee[] employees;

    public SimpleHashTable(){
        employees = new StoreEmployee[10];
    }

    public void put(String key, Employee employee){
        int hashKey = hashKey(key);
        if(occupied(hashKey)){
            int stopIndex = hashKey;
            if(hashKey==employees.length-1){
                hashKey = 0;
            }else {
                hashKey++;
            }
            while(occupied(hashKey) && hashKey !=stopIndex){
                hashKey = (hashKey+1)%employees.length;
            }
        }
        if (occupied(hashKey)){
            System.out.println("Sorry, there's already an employees at position " +hashKey);
        }
        else {
            employees[hashKey]= new StoreEmployee(key, employee);
        }
    }

    private boolean occupied(int index){
        return employees[index]!=null;
    }

    public Employee get(String key){
        int hashKey = findKey(key);
        if (hashKey==-1){
            return null;
        }
        return employees[hashKey].employee;
    }

    private int findKey(String key){
        int hashKey = hashKey(key);
        if(employees[hashKey]!=null && employees[hashKey].key.equals(key)){
            return hashKey;
        }


            int stopIndex = hashKey;
            if(hashKey==employees.length-1){
                hashKey = 0;
            }else {
                hashKey++;
            }
            while(employees[hashKey]!=null && !employees[hashKey].key.equals(key) && hashKey !=stopIndex){
                hashKey = (hashKey+1)%employees.length;
            }

            if(employees[hashKey]!=null && employees[hashKey].key.equals(key)) {
                return -1;
            }else {
                return hashKey;
            }

    }

    public void printHashTable(){
        for(int i=0; i<employees.length; i++){
            if(employees[i]== null){
                System.out.println("Empty.");
            }else {
                System.out.println(employees[i].employee);
            }
        }
    }

    public Employee remove(String key){
        int hashedKey = findKey(key);
        if(hashedKey ==-1){
            return null;
        }
        Employee employee = employees[hashedKey].employee;
        employees[hashedKey] = null;
        StoreEmployee[] oldHashTable = employees;
        employees = new StoreEmployee[oldHashTable.length];
        for (int i=0; i<oldHashTable.length; i++){
            if(oldHashTable[i]!=null){
                put(oldHashTable[i].key, oldHashTable[i].employee);
            }
        }


        return employee;
    }

    private int hashKey(String key){
        return key.length() % employees.length;
    }
}
