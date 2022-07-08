package com.uzair.binary.tree;

import com.uzair.binary.BNode;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    public BNode root;
    public void insert(int x) {
        var node = new BNode(x);
        if (root == null) {
            root = node;
            return;
        }
        var current = root;
        while (true) {
            if (x < current.value) {
                if (current.left == null) {
                    current.left = node;
                    break;
                }
                current = current.left;
            }
            else {
                if (current.right == null) {
                    current.right = node;
                    break;
                }
                current = current.right;
            }
        }
    }

    // * Find number using Iteration
    public boolean find(int x) {
        var current = root;
        while (current != null) {
            if (x < current.value)
                current = current.left;
            else if (x > current.value)
                current = current.right;
            else
                return true;
        }
        return false;
    }

    // * Find number using Recursion
    public boolean contains(int x) {
        return contains(root, x);
    }
    private boolean contains(BNode root, int x) {
        if (root == null)
            return false;
//        if (root.value == x)
//            return true;
//        return contains(root.left, x) || contains(root.right, x);
        return root.contains(x);
    }

    // * Traversal - Techniques
    // ? 1 - Breadth First - Level Order
    // ? 2 - Depth First - Pre-Order    (Root, Left, Right)
    public void traversePreOrder() {
        traversePreOrder(root);
    }
    private void traversePreOrder(BNode root) {
        if (root == null)
            return;
        System.out.println(root.value);
        traversePreOrder(root.left);
        traversePreOrder(root.right);
    }
    // ? 3 - Depth First - In-Order     (Left, Root, Right) [Accenting Order]
    public void traverseInOrder() {
        traversePreOrder(root);
    }
    private void traverseInOrder(BNode root) {
        if (root == null)
            return;
        traverseInOrder(root.left);
        System.out.println(root.value);
        traverseInOrder(root.right);
    }
    // ? 4 - Depth First - Post-Order   (Left, Right, Root) [Child to Root]
    public void traversePostOrder() {
        traversePostOrder(root);
    }
    private void traversePostOrder(BNode root) {
        if (root == null)
            return;
        traversePostOrder(root.left);
        System.out.println(root.value);
        traversePostOrder(root.right);
    }

    // * Depth = n of edges [Top to Bottom]
    // * Height = n of edges [Bottom to Top] {The Longest Path = Height of Tree}
    public int height() {
        return height(root);
    }
    private int height(BNode root) {
        if (root == null)
            return -1;
        if (isLeaf(root))
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // * Get Size of the tree
    public int size() {
        return size(root);
    }
    private int size(BNode root) {
       if (root == null)
           return 0;
       return (size(root.left) + size(root.right) + 1);
    }

    // * Count leaves in a tree
    public int countLeaves() {
        return countLeaves(root);
    }
    private int countLeaves(BNode root) {
        if (root == null)
            return 0;
        else if (root.left == null || root.right == null)
            return 1;
        else
            return countLeaves(root.left) + countLeaves(root.right);
    }

    // * Minimum Value
    public int min() {
        return min(root);
    }
    private int min(BNode root) {
        if (isLeaf(root))
            return root.value;
        var left = min(root.left);
        var right = min(root.right);
        return Math.min(Math.min(left, right), root.value);
    }

    // * Maximum Value
    public int max() {
        return max(root);
    }
    private int max(BNode root) {
        if (isLeaf(root))
            return root.value;
        var left = max(root.left);
        var right = max(root.right);
        return Math.max(Math.max(left, right), root.value);
    }

    // * Equals
    public boolean equals(Tree other) {
        if (other == null)
            return false;
        return equals(root, other.root);
    }
    private boolean equals(BNode first, BNode second) {
        if (first == null && second == null)
            return true;
        if (first != null && second != null)
            return first.value == second.value
                && equals(first.left, second.left)
                && equals(first.right, second.right);
        return false;
    }

    // * Check Binary Search Tree
    public boolean isBST() {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private boolean isBST(BNode root, int min, int max) {
        if (root == null)
            return true;
        if (root.value < min || root.value > max)
            return false;
        return (isBST(root.left, min, root.value - 1)
                && isBST(root.right, root.value + 1, max));
    }

    // * Check if node is ancestor
    public List<Integer> getAncestor(int x) {
        var list = new ArrayList<Integer>();
        getAncestor(root, x, list);
        return list;
    }
    private boolean getAncestor(BNode root, int x, List<Integer> list) {
        if (root == null)
            return false;
        if (root.value == x)
            return true;
        if (getAncestor(root.left, x, list) ||
            getAncestor(root.right, x, list))
            list.add(root.value);
        return true;
    }

    // * Check if two nodes are sibling
    public boolean areSibling(int x, int y) {
        return areSibling(root, x, y);
    }
    private boolean areSibling(BNode root, int x, int y) {
        if (root == null)
            return false;
        if (root.left != null && root.right != null) {
            int left = root.left.value;
            int right = root.right.value;
            if
            (
                (left == x && right == y) ||
                (left == y && right == y) ||
                areSibling(root.left, x, y) ||
                areSibling(root.right, x, y)
            )
                return true;
        }
        return false;
    }

    // * Print Nodes At Distance
    public ArrayList<Integer> getNodesAtDistance(int k) {
        var list = new ArrayList<Integer>();
        getNodesAtDistance(root, k, list);
        return list;
    }
    private void getNodesAtDistance(BNode root, int distance, ArrayList<Integer> list) {
        if (root == null)
            return;
        if (distance == 0) {
            list.add(root.value);
            return;
        }
        getNodesAtDistance(root.left, distance - 1, list);
        getNodesAtDistance(root.right, distance - 1, list);

    }

    // * Level Order
    public void traverseLevelOrder() {
        for (var i = 0; i <= height(); i++)
                System.out.println(getNodesAtDistance(i));
    }

    // * Swap Value
    public void swapRoot() {
        var temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public boolean isEmpty() {
        return root == null;
    }

    private boolean isLeaf(BNode node) {
        return node.left == null && node.right == null;
    }

}