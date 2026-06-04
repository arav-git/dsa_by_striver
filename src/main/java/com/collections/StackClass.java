package com.collections;

import java.util.Stack;

public class StackClass {
    static void main() {
        //Last in First Out
        Stack<Integer> st = new Stack<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.remove(1);
        System.out.println(st);

        st.push(4);
        st.push(5);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        //gives last element of the stack
        st.peek();

    }
}
