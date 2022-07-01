package com.uzair;
import com.uzair.linear.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new List();
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
        System.out.println(linkedlist.hasLoop());

    }
}
