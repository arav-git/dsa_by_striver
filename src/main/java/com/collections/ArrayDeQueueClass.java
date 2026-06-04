package com.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Vector;

public class ArrayDeQueueClass {
        static void main() {
            //FIFO
            ArrayDeque<Integer> ad = new ArrayDeque<>();
            ad.offer(1);
            ad.offer(2);
            ad.offer(5);
            System.out.println(ad);
            System.out.println(ad.peek());
            ad.poll();
            System.out.println(ad);
        }
    }
