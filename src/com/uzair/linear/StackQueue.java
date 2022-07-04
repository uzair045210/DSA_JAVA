package com.uzair.linear;

import java.util.Stack;

public class StackQueue {
    private Stack<Integer> s1 = new Stack<>();  // * enqueue
    private Stack<Integer> s2 = new Stack<>();  // * dequeue

    private void move() {
        if (s2.isEmpty())
            while (!s1.empty())
                s2.push(s1.pop());
    }

    public void enqueue(int item) {
        s1.push(item);
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();
        move();
        return s2.pop();
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();
        move();
        return s2.peek();
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

}
