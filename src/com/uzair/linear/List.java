package com.uzair.linear;

import java.util.NoSuchElementException;

public class List {
    private Node first;
    private Node last;
    private int size;

    // Add Last
    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }
    // Add First
    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }
    // Delete First
    public void removeFirst() {
        // [10 20 -> 30]
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last)
            first = last = null;
        else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }
    // Delete Last
    public void removeLast(int item) {
        // [10 -> 20 30]
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last)
            first = last = null;
        else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }
    // Contains
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }
    // Index Of
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }
    // Reverse
    public void reverse() {
        if (isEmpty())
            return;
        var previous = first;
        var current = first.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }
    public int getKthFromEnd(int k) {
        var a = first;
        var b = first;
        for (int i = 0; i < k - 1; i++)
            b = b.next;
        while (b != last) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    }
    // Get Middle Item
    public void printMiddle() {
        if (isEmpty())
            throw new IllegalStateException();
        var a = first;
        var b = first;
        while (b != last && b.next != last) {
            b = b.next.next;
            a = a.next;
        }
        if (b == last)
            System.out.println(a.value);
        else
            System.out.println(a.value + ", " + a.next.value);
    }
    // Has Loop
    public boolean hasLoop() {
        var slow = first;
        var fast = first;
        while (fast != null || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
    // To Array
    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        int i = 0;
        while (i < size) {
            array[i++] = current.value;
            current = current.next;
        }
        return array;
    }
    // Get Size
    public int size() {
        return size;
    }
    // Print
    public void print() {
        StringBuilder sb = new StringBuilder();
        var current = first;
        sb.append('{');
        while (current != null) {
            sb.append(current.value);
            current = current.next;
            if (current != null)
                sb.append(", ");
        }
        sb.append('}');
        System.out.println(sb);
    }
    // Create With Loop
    public static List createWithLoop() {
        var list = new List();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        var node = list.last;
        list.addLast(40);
        list.addLast(50);
        list.last.next = node;
        return list;
    }
    // Is Empty
    private boolean isEmpty() {
        return first == null;
    }
    // Get Previous Node
    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }


}