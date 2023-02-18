package com.loveable.linkedList;

public class Main {
    public static void main(String[] args) {
        Linked_List<Integer> linkedList = new Linked_List<>();
        linkedList.addFirst(5);
        System.out.println(linkedList);

        linkedList.addFirst(4);
        System.out.println(linkedList);

        linkedList.addLast(6);
        System.out.println(linkedList);

        linkedList.add(0, 3);
        System.out.println(linkedList);

//        linkedList.add(4, 7);
//        System.out.println(linkedList);

        linkedList.add(3, 0);
        System.out.println(linkedList);

        System.out.println(linkedList.size());
    }
}
