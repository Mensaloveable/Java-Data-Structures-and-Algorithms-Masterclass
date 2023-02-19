package com.loveable.linkedList;

public class Main {
    public static void main(String[] args) {
        Linked_List<Integer> linkedList = new Linked_List<>();
//        System.out.println("First element is: " + linkedList.getFirst());

        System.out.println("linkedList.isEmpty() is: " + linkedList.isEmpty());

        linkedList.addFirst(5);
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);

        System.out.println("linkedList.contains(6) is: " + linkedList.contains(6));

        System.out.println("linkedList.contains(null) is: " + linkedList.contains(null));

        linkedList.addFirst(4);
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.addLast(7);
        System.out.println(linkedList);

        linkedList.addLast(8);
        System.out.println(linkedList);

        linkedList.add(0, 3);
        System.out.println(linkedList);

        linkedList.add(linkedList.size(), 9);
        System.out.println(linkedList);

        linkedList.add(3, 6);
        System.out.println(linkedList);

        System.out.println("Third element is: " + linkedList.get(2));

        System.out.println("linkedList.contains(6) is: " + linkedList.contains(6));

        System.out.println("linkedList.contains(5) is: " + linkedList.contains(5));

        System.out.println("linkedList.contains(null) is: " + linkedList.contains(null));

        System.out.println("Last element is: "+linkedList.getLast());

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);

        linkedList.remove(1);
        System.out.println(linkedList);

        linkedList.remove(1);
        System.out.println(linkedList);

        System.out.println("linkedList.isEmpty() is: " + linkedList.isEmpty());

        System.out.println("First element is: " + linkedList.getFirst());


        System.out.println("clear method");
        linkedList.clear();
        System.out.println(linkedList);

        linkedList.addLast(9);
        linkedList.addFirst(8);
        System.out.println(linkedList);

        System.out.println("last size = " + linkedList.size());
    }
}
