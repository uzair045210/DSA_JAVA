package com.uzair.examples;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueExample {
    public void reverse(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty())
            stack.push(q.remove());
        while (!stack.isEmpty())
            q.add(stack.pop());
    }
}
