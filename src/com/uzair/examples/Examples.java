package com.uzair.examples;

import java.util.Stack;

public class Examples {
    public String reverse(String exp) {
        if (exp == null)
            throw new IllegalArgumentException();
        Stack<Character> stack = new Stack<Character>();
        for (char ch : exp.toCharArray())
            stack.push(ch);
        StringBuffer rev = new StringBuffer();
        while (!stack.empty()) {
            rev.append(stack.pop());
        }
        return rev.toString();
    }
}
