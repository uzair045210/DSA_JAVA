package com.uzair;
import com.uzair.examples.QueueExample;
import com.uzair.linear.ArrayQueue;
import com.uzair.linear.List;
import com.uzair.linear.Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
    // * Queue Using Array
    ArrayQueue aq = new ArrayQueue(5);
    aq.enqueue(10);
    aq.enqueue(20);
    aq.enqueue(30);
    System.out.println(aq);
    aq.dequeue();
    aq.dequeue();
    System.out.println(aq);
    aq.enqueue(40);
    aq.enqueue(50);
    aq.enqueue(60);
    aq.enqueue(70);
    System.out.println(aq);
    System.out.println(aq.isFull());
    aq.dequeue();
    aq.dequeue();
    System.out.println(aq.isEmpty());
    System.out.println(aq);
    System.out.println(aq.peek());
    aq.enqueue(80);
    System.out.println(aq);
    aq.enqueue(90);
    System.out.println(aq);
    aq.dequeue();
    System.out.println(aq);
    System.out.println(aq.peek());
    aq.enqueue(100);
    System.out.println(aq);

//     * Stack
//    Stack stack = new Stack(10);
//    stack.push(10);
//    stack.push(20);
//    stack.push(30);
//    System.out.println(stack.toString());
//    stack.pop();
//    System.out.println(stack.toString());
//    System.out.println(stack.peek());
//    System.out.println(stack.isEmpty());

    // * Linked List
        /*var list = new List();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addFirst(5);
        list.print();
        list.removeFirst();
        list.print();
        list.removeFirst();
        list.print();
        System.out.println(list.indexOf(20));
        System.out.println(list.contains(100));
        System.out.println(Arrays.toString(list.toArray()));
        list.reverse();
        list.print();
        System.out.println(list.getKthFromEnd(5));
        list.addLast(100);
        list.printMiddle();

        var linkedlist = List.createWithLoop();
        System.out.println(linkedlist.hasLoop());*/

    }
}
