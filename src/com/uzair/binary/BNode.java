package com.uzair.binary;

public class BNode {
    public int value;
    public BNode left;
    public BNode right;
    public BNode(int value) {
        this.value = value;
    }
    public boolean contains(int x) {
        if (x == value) return true;
        if (left != null && left.contains(x))
            return true;
        if (right != null && right.contains(x))
            return true;
        return false;
    }
    @Override
    public String toString() {
        return "Node=" + value;
    }
}
