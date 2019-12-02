package com.tonasolution;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {

        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setNext(head);
        head = employeeNode;
        size++;
    }

    public void printList() {

        EmployeeNode current = head;

        System.out.print("HEAD -> ");

        while (current != null) {

            System.out.println(current);
            System.out.print("->");
            current = current.getNext();
        }

        System.out.println("Null");
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }


    public EmployeeNode removeFromTheFront() {

        if (isEmpty()) return null;

        EmployeeNode nodeRemoved = head;
        head = head.getNext();
        size--;
        nodeRemoved.setNext(null);

        return nodeRemoved;
    }
}
