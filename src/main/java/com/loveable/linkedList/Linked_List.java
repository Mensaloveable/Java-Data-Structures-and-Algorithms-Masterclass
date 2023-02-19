package com.loveable.linkedList;

public class Linked_List<T> {
    int size;

    public static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private Node<T> tail;

    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, T element) {
        if (index == 0) {
            addFirst(element);
        } else if (index == size) {
            addLast(element);
        } else if (index > 0 && index < size) {
            Node<T> newNode = new Node<>(element);
            Node<T> node = head;
            while (index > 1) {
                node = node.next;
                index--;
            }
            newNode.next = node.next;
            node.next = newNode;
            size++;
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bound");
        }
    }



    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (head == null)
            return "[]";
        StringBuilder elements = new StringBuilder("[");
        Node<T> next = head;
        while (next != null) {
            elements.append(next.data).append(", ");
            next = next.next;
        }
        String result = elements.toString();
        result = result.substring(0, result.length() - 2) + "]";
        return result;
    }
}
