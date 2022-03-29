package com.day14;

import java.util.LinkedList;

public class LinkListUc4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.addFirst(70);
        list.addFirst(56);
        System.out.println(list);

        list.add(1,30);
        System.out.println(list);
    }
}
