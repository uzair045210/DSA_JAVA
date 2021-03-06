package com.uzair;

import com.uzair.algorithms.Sort;
import com.uzair.binary.BNode;
import com.uzair.binary.Heap;
import com.uzair.binary.Trie.Trie;
import com.uzair.binary.tree.AVLTree;
import com.uzair.binary.tree.BTPrinter;
import com.uzair.binary.tree.Tree;
import com.uzair.examples.HashMapExample;
import com.uzair.linear.hashmap.HashMap;
import com.uzair.linear.hashmap.HashTable;
import com.uzair.linear.queue.ListQueue;
import com.uzair.linear.queue.PriorityQueue;
import com.uzair.linear.queue.QueueReverser;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // * Sorting
//        int[] arr = {2, 8, 5, 4, 3, 1};
//        Sort sort = new Sort();
//        sort.bubbleSort(arr);
//        sort.selectionSort(arr);
//        sort.insertionSort(arr);
//        sort.mergeSort(arr);
//        sort.quickSort(arr);
//        sort.countingSort(arr, 8);
//        sort.bucketSort(arr, 3);
//        System.out.println("Array = " + Arrays.toString(arr));
        // * Trie
        Trie t = new Trie();
        t.insert("car");
        t.insert("card");
        t.insert("care");
        t.insert("careful");
        t.insert("eagle");
        t.insert("egg");
        var words = t.findWords("care");
        System.out.println(words);
        System.out.println("Contains = " + t.containsRecursive("car"));
        System.out.println("Total Words = " + t.countWords());
        t.remove("car");
        System.out.println("Total Words = " + t.countWords());
        System.out.println("Ascending");
        t.traverse(Trie.ASCENDING);
        System.out.println("Descending");
        t.traverse(Trie.DESCENDING);
        String[] s = {"card", "care", "careful"};
        System.out.println("Longest Common Prefix: " + t.longestCommonPrefix(s));
        System.out.println("Done");
        // * Heap
//        Heap heap = new Heap(10);
//        heap.insert(10);
//        heap.insert(5);
//        heap.insert(17);
//        heap.insert(4);
//        heap.insert(22);
//        System.out.println(heap);
//        heap.remove();
//        System.out.println(heap);
        // * AVL - Tree
//        AVLTree avlTree = new AVLTree();
//        avlTree.insert(10);
//        avlTree.insert(20);
//        avlTree.insert(30);
//        System.out.println("Done");
        // * Tree
//        Tree tree = new Tree();
//        tree.insert(7);
//        tree.insert(4);
//        tree.insert(9);
//        tree.insert(1);
//        tree.insert(6);
//        tree.insert(8);
//        tree.insert(10);
//        tree.insert(9);
//        tree.insert(15);
//        tree.insert(20);
//        System.out.println(tree.isBalanced());
//        System.out.println(tree.isPerfect());
//        tree.swapRoot();
//        tree.swapRoot();
//        Tree tree1 = new Tree();
//        tree1.insert(7);
//        tree1.insert(4);
//        tree1.insert(9);
//        tree1.insert(1);
//        tree1.insert(6);
//        tree1.insert(8);
//        tree1.insert(10);
//        System.out.println("Equals = " + tree.equals(tree1));
//        System.out.println("Find 10 = " + tree.find(10));
//        System.out.println("Contains = " + tree.contains(12));
//        tree.traversePreOrder();
//        System.out.println("\n");
//        tree.traverseInOrder();
//        System.out.println("\n");
//        tree.traversePostOrder();
//        System.out.println("Height = " + tree.height());
//        System.out.println("Size = " + tree.size());
//        System.out.println("No. of Leaves = " + tree.countLeaves());
//        System.out.println("Minimum = " + tree.min());
//        System.out.println("Maximum = " + tree.max());
//        System.out.println("IS Binary Search Tree = " + tree.isBST());
//        BTPrinter.printNode(tree.root);
//        System.out.println("Nodes At Height");
//        System.out.println(tree.getNodesAtDistance(0));
//        System.out.println("Traverse Level Order");
//        tree.traverseLevelOrder();
//        System.out.println("Are Siblings = " + tree.areSibling(4, 6));
//        System.out.println("Ancestors = " + tree.getAncestor(10));
//        System.out.println("Done");
        // * Double Probing - HashMap
//        HashMap hashMap = new HashMap(5);
//        hashMap.put(6, "A");
//        hashMap.put(8, "B");
//        hashMap.put(11, "C");
//        hashMap.remove(6);
//        hashMap.put(13, "D");
//        hashMap.put(11, "C+");
//        hashMap.remove(13);
//        System.out.println(hashMap.get(8));
//        System.out.println(hashMap);
        // * Linear Probing - HashMap
//        HashMap hashMap = new HashMap(5);
//        hashMap.put(6, "A");
//        hashMap.put(8, "B");
//        hashMap.put(11, "C");
//        hashMap.remove(6);
//        hashMap.put(13, "D");
//        hashMap.put(11, "C+");
//        hashMap.remove(13);
//        System.out.println(hashMap.get(11));
//        System.out.println(hashMap);
        // * HashTable
//        HashTable table = new HashTable(5);
//        table.put(6, "A");
//        table.put(8, "B");
//        table.put(11, "C");
//        table.put(6, "A+");
//        table.remove(6);
//        System.out.println(table.get(11));

        // * HashMap Example
//        HashMapExample hme = new HashMapExample();
//        int[] items = {1, 2, 2, 3, 3, 3, 4, 5};
//        System.out.println(hme.mostFrequent(items));
//        int[] items2 = {1, 7, 5, 9, 2, 12, 3};
//        System.out.println(hme.countPairWithDifference(items2, 2));
//        int[] items3 = {2, 7, 11, 15};
//        int[] result = hme.twoSum(items3, 9);
//        for (var n : result)
//            System.out.println(n);
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
