package org.example;


public class Homework_2 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAll(new int[]{1, 2, 3, 4, 5, 6, 7});
        System.out.println(list);
        list.revert();
        System.out.println(list);
    }
}
