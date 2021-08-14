package com.datastructures.doublelinkedlist;

public class EmployeeDoubleLinkedListChallenge {
    private int size;
    private EmployeeNode head;
    private EmployeeNode tail;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);

        if(head==null){
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }
        head = node;
        size++;
    }

    public boolean addBefore(Employee employee, Employee oldEmployee) {
        if(head==null){
            return false;
        }
        EmployeeNode current = head;
        while (current!=null && !current.getEmployee().equals(oldEmployee)){
            current = current.getNext();
        }

        if(current==null){
            return false;
        }

        EmployeeNode newEmployee = new EmployeeNode(employee);
        current.setPrevious(current.getPrevious());
        current.setNext(current);
        current.setPrevious(newEmployee);

        if(head==current){
            head = newEmployee;
        }else {
            newEmployee.getPrevious().setNext(newEmployee);
        }
        size++;
        return true;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty(){
        return this.head==null;
    }

    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }
        EmployeeNode removed = head;
        if(head.getNext()==null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        removed.setNext(null);
        return removed;
    }

    public EmployeeNode removeFromEnd(){
        if(isEmpty()){
            return null;
        }
        EmployeeNode removed = tail;
        if(tail.getPrevious()==null){
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        return removed;
    }

    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        if(tail==null){
            head = node;
        }

        else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }
    public void printList(){
        EmployeeNode current = head;
        System.out.println("HEAD->");
        while (current!=null){
            System.out.println(current);
            System.out.println("<->");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
