package com.uzair.binary;

import java.util.Arrays;

public class Heap {
    private int[] items;
    private int size;

    public Heap(int n) {
        items = new int[n];
    }

    public void insert(int value) {
        if (isFull())
            throw new IllegalStateException();
        items[size++] = value;
        bubbleUp();
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();
        var root = items[0];
        items[0] = items[--size];
        bubbleDown();
        return root;
    }

    private int largeIndex(int index) {
        if (!hasLeftChild(index))
            return index;
        if (!hasRightChild(index))
            return leftIndex(index);
        return (left(index) > right(index)) ?
                leftIndex(index) : rightIndex(index);
    }

    private boolean hasLeftChild(int index) {
        return leftIndex(index) <= size;
    }

    private boolean hasRightChild(int index) {
        return rightIndex(index) <= size;
    }

    private boolean isValidParent(int index) {
        if (!hasLeftChild(index))
            return true;
        var isLeftValid = items[index] >= left(index);
        var isRightValid = items[index] >= right(index);
        if (!hasRightChild(index))
             isLeftValid &= isRightValid;
        return isLeftValid;
    }

    private int left(int index) {
        return items[leftIndex(index)];
    }

    private int right(int index) {
        return items[rightIndex(index)];
    }

    private int leftIndex(int index) {
        return (index * 2) + 1;
    }

    private int rightIndex(int index) {
        return (index * 2) + 2;
    }

    private void bubbleUp() {
        var index = size - 1;
        while (index > 0 && items[index] > items[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    private void bubbleDown() {
        var index = 0;
        while (index <= size && !isValidParent(index)) {
            var largeIndex = largeIndex(index);
            swap(index, largeIndex);
            index = largeIndex;
        }
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int i, int j) {
        var temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

    public boolean isFull() {
        return size == items.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(items, 0, size));
    }

}
