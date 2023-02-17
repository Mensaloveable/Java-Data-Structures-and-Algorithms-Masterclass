package com.loveable.linkedList;

public class Linked_List<T> {

    public static class Node<T> {
        T data;
        Node<T> node;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", node=" + node +
                    '}';
        }
    }
}
