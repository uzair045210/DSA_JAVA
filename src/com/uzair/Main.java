package com.uzair;

import com.uzair.examples.HashMapExample;
import com.uzair.linear.hashmap.HashTable;
import com.uzair.linear.queue.ListQueue;
import com.uzair.linear.queue.PriorityQueue;
import com.uzair.linear.queue.QueueReverser;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // * HashTable
        HashTable table = new HashTable(5);
        table.put(6, "A");
        table.put(8, "B");
        table.put(11, "C");
        table.put(6, "A+");
        table.remove(6);
        System.out.println(table.get(11));

        // * HashMap Example
        HashMapExample hme = new HashMapExample();
        int[] items = {1, 2, 2, 3, 3, 3, 4, 5};
        System.out.println(hme.mostFrequent(items));
        int[] items2 = {1, 7, 5, 9, 2, 12, 3};
        System.out.println(hme.countPairWithDifference(items2, 2));
        int[] items3 = {2, 7, 11, 15};
        int[] result = hme.twoSum(items3, 9);
        for (var n : result)
            System.out.println(n);
//        System.out.println(hme.getNonRepeated("a green apple"));
        // * ListQueue
//        ListQueue listQueue = new ListQueue();
//        listQueue.enqueue(10);
//        listQueue.enqueue(20);
//        listQueue.enqueue(30);
//        System.out.println(listQueue);
//        listQueue.enqueue(40);
//        listQueue.enqueue(50);
//        System.out.println(listQueue);
//        listQueue.dequeue();
//        listQueue.dequeue();
//        listQueue.dequeue();
//        System.out.println(listQueue);
//        System.out.println(listQueue.isEmpty());
//        System.out.println(listQueue.size());
//        System.out.println(listQueue.peek());
//        listQueue.dequeue();
//        listQueue.dequeue();
//        System.out.println(listQueue);
//        System.out.println(listQueue.isEmpty());
//        System.out.println(listQueue.size());
//        System.out.println(listQueue.peek());

        // * PriorityQueue
//        PriorityQueue pq = new PriorityQueue(5);
//        pq.add(2);
//        pq.add(3);
//        pq.add(6);
//        pq.add(1);
//        pq.add(4);
//        System.out.println(pq);
//        while (!pq.isEmpty())
//            System.out.println(pq.remove());
//        System.out.println(pq);
//        Queue<Integer> q = new ArrayDeque<>();
//        q.add(10);
//        q.add(20);
//        q.add(30);
//        q.add(40);
//        q.add(50);
//        QueueReverser.reverse(q, 3);
//        System.out.println(q);

        // * Queue Using Stack
//        StackQueue sq = new StackQueue();
//        sq.enqueue(10);
//        sq.enqueue(20);
//        sq.enqueue(30);
//        sq.dequeue();
//        sq.dequeue();
//        sq.dequeue();
        // * Queue Using Array
    //    ArrayQueue aq = new ArrayQueue(5);
    //    aq.enqueue(10);
    //    aq.enqueue(20);
    //    aq.enqueue(30);
    //    System.out.println(aq);
    //    aq.dequeue();
    //    aq.dequeue();
    //    System.out.println(aq);
    //    aq.enqueue(40);
    //    aq.enqueue(50);
    //    aq.enqueue(60);
    //    aq.enqueue(70);
    //    System.out.println(aq);
    //    System.out.println(aq.isFull());
    //    aq.dequeue();
    //    aq.dequeue();
    //    System.out.println(aq.isEmpty());
    //    System.out.println(aq);
    //    System.out.println(aq.peek());
    //    aq.enqueue(80);
    //    System.out.println(aq);
    //    aq.enqueue(90);
    //    System.out.println(aq);
    //    aq.dequeue();
    //    System.out.println(aq);
    //    System.out.println(aq.peek());
    //    aq.enqueue(100);
    //    System.out.println(aq);

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
