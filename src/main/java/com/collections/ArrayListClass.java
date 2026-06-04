package com.collections;

import java.util.*;
public class ArrayListClass {
    

    public static void main(String[] args){
        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(5);
        aList.add(10);
        aList.add(20);
        aList.add(-10);
        System.out.println(aList);

        for(int a: aList){
            System.out.println(a);
        }
        System.out.println("Normal for loop");
        for(int i = 0; i < aList.size(); i++){
            System.out.println(aList.get(i));
        }
    }
}
