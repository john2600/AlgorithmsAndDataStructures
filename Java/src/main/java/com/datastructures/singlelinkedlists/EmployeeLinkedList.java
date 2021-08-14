package com.datastructures.singlelinkedlists;

public class EmployeeLinkedList {
    private int size;
    private EmployeeNode head;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
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
        head = head.getNext();
        size--;
        removed.setNext(null);
        return removed;
    }
    public void printList(){
        EmployeeNode current = head;
        System.out.println("HEAD->");
        while (current!=null){
            System.out.println(current);
            System.out.println("->");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
