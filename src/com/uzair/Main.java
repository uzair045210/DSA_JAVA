package com.uzair;
import com.uzair.linear.Array;

public class Main {
    public static void main(String[] args) {
        Array arr = new Array(3);
        arr.insert(40);
        arr.insert(30);
        arr.insert(100);
        System.out.println("Array SIZE = " + arr.size() + " => ");
        arr.print();
        // Auto Resize
        arr.insert(10);
        arr.insert(150);
        arr.insert(120);
        arr.insert(50);
        arr.insert(180);
        arr.insert(175);
        System.out.println("\nInsert Element at last index => ");
        arr.print();
        for (int i = 0; i < arr.size(); i++)
            arr.insertAt(((i + 10) % 6) * (3 * i), i);
        System.out.println("\nChange all the elements => ");
        arr.print();
        arr.remove();
        System.out.println("\nRemove an element at last index => ");
        arr.print();
        arr.removeAt(1);
        System.out.println("\nRemove an element at 1st index => ");
        arr.print();
        Array reverse = arr.reverse();
        System.out.println("\nReverse of an array => ");
        reverse.print();
        int max = arr.max();
        System.out.println("\nMax = " + max);
        System.out.println("\nArray => ");
        arr.print();
        System.out.println("\nProvide invalid index => (size = " + arr.size() + "): ");
        System.out.println("Insert at " + (arr.size() + 1) + " => Produces Error!");
        arr.removeAt(9);
    }
}
