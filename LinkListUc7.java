package com.day14;

import java.util.LinkedList;

public class LinkListUc7 extends Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.addFirst(70);
        list.addFirst(30);
        list.addFirst(56);
//        System.out.println(list);

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
