package com.collections;

import java.util.LinkedList;

public class LinkedListClass {
    static void main() {
        LinkedList<Integer> ll1 = new LinkedList<Integer>();
        ll1.add(5);
        ll1.add(10);
        ll1.add(-12);
        ll1.add(100);
        System.out.println(ll1);

        ll1.remove(2);
        System.out.println(ll1);

        LinkedList<Integer> ll2 = new LinkedList<Integer>();
        ll2.add(6);
        ll2.add(11);
        ll2.add(-11);
        ll2.add(101);
        ll2.addFirst(0);
        ll2.addLast(10000);
        ll2.removeFirst();
        ll2.removeLast();

        System.out.println(ll2);

        ll1.addAll(ll2);
        System.out.println(ll1);

        ll2.addAll(ll1);
        System.out.println(ll1);
        System.out.println(ll2);





    }
}
