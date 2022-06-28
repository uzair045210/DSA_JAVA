package com.uzair.linear;

public class Array {
    private int[] items;
    private int count;
    public Array(int length) {
        items = new int[length];
    }
    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            System.arraycopy(items, 0, newItems, 0, count);
            items = newItems;
        }
        items[count++] = item;
    }
    public void insertAt(int item, int index) {
        int[] newItems = new int[count * 2];
        for (int i = 0; i < count; i++)
            if (i != index)
                newItems[i] = items[i];
            else
                newItems[index] = item;
        items = newItems;
    }
    public void remove() {
        removeAt(count-1);
    }
    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        System.arraycopy(items, index + 1, items, index, count - index);
        count--;
    }
    public int max() {
        int max = items[0];
        for (int i = 1; i < count; i++)
            if (items[i] > max)
                max = items[i];
        return max;
    }
    public Array reverse() {
        Array newItems = new Array(count);
        for (int i = count - 1; i >= 0; i--)
            newItems.insert(items[i]);
        return newItems;
    }
    public int size() {
        return count;
    }
    public void print() {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("\t[");
        while (i < count) {
            sb.append(items[i]);
            i++;
            if (i != count)
                sb.append(", ");
        }
        sb.append("]");
        System.out.println(sb);
    }
}
