package com.uzair.binary.tree;

public class AVLTree {
    private class AVLNode {
        private int height, value;
        private AVLNode left, right;
        public AVLNode(int value) {
            this.value = value;
        }
        @Override
        public String toString() {
            return "Value=" + value;
        }
    }

    private AVLNode root;

    public void insert(int value) {
        root = insert(root, value);
    }
    private AVLNode insert(AVLNode root, int value) {
        if (root == null)
            return new AVLNode(value);
        if (value < root.value)
            root.left = insert(root.left, value);
        else
            root.right = insert(root.right, value);
        setHight(root);
        return balance(root);
    }

    private AVLNode balance(AVLNode node) {
        if (isLeftHeavy(node)) {
            if (balanceFactor(node.left) < 0)
                node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        else if (isRightHeavy(node)) {
            if (balanceFactor(node.right) > 0)
                node.right = rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;
    }

    private void setHight(AVLNode node) {
        node.height = Math.max(height(node.left), height(node.right)) + 1;
    }

    private int height(AVLNode node) {
        return (node == null) ? -1 : node.height;
    }

    private int balanceFactor(AVLNode node) {
        return (node == null) ? 0 : (height(node.left) - height(node.right));
    }

    private boolean isLeftHeavy(AVLNode node) {
        return (balanceFactor(node) > 1) ? true : false;
    }

    private boolean isRightHeavy(AVLNode node) {
        return (balanceFactor(node) < -1) ? true : false;
    }

    private AVLNode rotateRight(AVLNode node) {
        var newRoot = node.left;
        node.left = newRoot.right;
        newRoot.right = node;
        setHight(node);
        setHight(newRoot);
        return newRoot;
    }

    private AVLNode rotateLeft(AVLNode node) {
        var newRoot = node.right;
        node.right = newRoot.left;
        newRoot.left = node;
        setHight(node);
        setHight(newRoot);
        return newRoot;
    }

}