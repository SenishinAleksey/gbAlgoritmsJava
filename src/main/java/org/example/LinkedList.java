package org.example;

class LinkedList {
    private Node head;
    private Node tail;


    public void revert() {
        Node node = this.head;
        Node tmp = this.head;
        this.head = this.tail;
        this.tail = tmp;

        while (node != null) {
            tmp = node.nextNode;
            node.nextNode = node.previousNode;
            node.previousNode = tmp;
            node = tmp;
        }
    }

    public void add(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            this.head = node;
            this.tail = node;
            return;
        }
        this.tail.nextNode = node;
        node.previousNode = this.tail;
        this.tail = node;
    }

    public void addAll(int[] values) {
        for (int i = 0; i < values.length; i++) {
            this.add(values[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node node = this.head;
        while (node != null) {
            str.append(node.value).append(' ');
            node = node.nextNode;
        }
        return str.toString();
    }

    static class Node {
        private int value;
        private Node nextNode;
        private Node previousNode;
    }
}
