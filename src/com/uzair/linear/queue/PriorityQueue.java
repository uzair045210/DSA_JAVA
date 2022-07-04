package com.uzair.linear.queue;

import java.util.Arrays;
import java.util.Stack;

public class PriorityQueue {

    private int[] items;
    private int count;

    private int shiftItems(int item) {
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > item)
                items[i + 1] = items[i];
            else
                break;
        }
        return i + 1;
    }

    public PriorityQueue(int capacity) {
        items = new int[capacity];
    }

    public void add(int item) {
        if (isFull())
            throw new IllegalStateException();
        var i = shiftItems(item);
        items[i] = item;
        count++;
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();
        return items[--count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

}
