package com.day14;

import java.util.LinkedList;

public class LinkListUc8 extends Main{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.addFirst(70);
        list.addFirst(30);
        list.addFirst(56);
        System.out.println(list);

        list.add(2,40);
        System.out.println(list);

    }
}
