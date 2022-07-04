package com.uzair.linear.queue;

import com.uzair.linear.Node;

import java.util.ArrayList;

public class ListQueue {
    private Node head;
    private Node tail;
    private int count;

    public void enqueue(int item) {
        var temp = new Node(item);
        if (isEmpty())
            head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        count++;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();
        int value;
        if (head == tail) {
            value = head.value;
            head = tail = null;
        } else {
            value = head.value;
            var temp = head.next;
            head.next = null;
            head = temp;
        }
        count--;
        return value;
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();
        return head.value;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        ArrayList<Integer> list = new ArrayList<>();
        Node current = head;
        while (current != null) {
            list.add(current.value);
            current = current.next;
        }
        return list.toString();
    }
}
