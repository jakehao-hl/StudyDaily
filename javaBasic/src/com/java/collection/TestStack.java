package com.java.collection;

import java.util.LinkedList;

class ClassStack {
    LinkedList linkedList;

    ClassStack() {
        linkedList = new LinkedList();
    }

    //入栈
    void push(Object obj) {
        linkedList.addLast(obj);
    }

    //出栈
    void pop(Object obj) {
        linkedList.removeLast();
    }

    @Override
    public String toString() {
        return "ClassStack{" +
                "linkedList=" + linkedList +
                '}';
    }
}

public class TestStack {

    public static void main(String[] args) {
//        Stack stack= new Stack();
//        stack.pop();
        ClassStack stack = new ClassStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack);

    }
}
