package com.loveable.linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Linked_List<Integer> linkedList = new Linked_List<>();
        linkedList.addFirst(5);

        System.out.println(linkedList);

        linkedList.addFirst(4);

        System.out.println(linkedList);

        linkedList.addFirst(3);

        System.out.println(linkedList);

//        LinkedList<Integer> integers = new LinkedList<>();
//        integers.add(8);
//        integers.add(9);
//        integers.add(10);
//        integers.addFirst(7);
//        System.out.println(integers);
    }
}
