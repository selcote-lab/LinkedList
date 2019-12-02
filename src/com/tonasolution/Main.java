package com.tonasolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Employee zouhaire = new Employee("zouhaire", "elakioui", 123);
        Employee jack = new Employee("jack", "ali", 1234);
        Employee kali = new Employee("kali", "maeckel", 12345);

        EmployeeLinkedList linkedList = new EmployeeLinkedList();

        linkedList.addToFront(zouhaire);
        linkedList.addToFront(jack);
        linkedList.addToFront(kali);

        linkedList.printList();

        System.out.println(linkedList.getSize());

        System.out.println("Is empty -> " + linkedList.isEmpty());

        System.out.println("Removed node --> " + linkedList.removeFromTheFront());

        linkedList.printList();
    }
}
