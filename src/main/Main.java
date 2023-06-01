package main;

import linkedList.MyLinkedList;

public class Main {

    public static void main(String[] args) {

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

       linkedList.addInBetween(77, 1);

        linkedList.print();

    }

}
