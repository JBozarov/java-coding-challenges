package com.javacodingchallenges.other;

import java.util.List;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(6);
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.pop();
        stack.push(8);
        stack.push(10);
        stack.push(12);
        stack.push(14);
        stack.push(16);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
