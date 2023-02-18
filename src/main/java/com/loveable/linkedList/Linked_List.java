package com.loveable.linkedList;

public class Linked_List<T> {

    public static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", node=" + next +
                    '}';
        }
    }

    private Node<T> head;
    private Node<T> tail;

    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null)
            head = tail = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    @Override
    public String toString() {
        return "Linked_List{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
