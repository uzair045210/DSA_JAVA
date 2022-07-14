package com.uzair.binary.Trie;

import java.util.HashMap;

public class TNode {
//    public static int ALPHABET_SIZE = 26;
    public char value;
    private HashMap<Character, TNode> children = new HashMap<>();
    public boolean isEndOfWord;

    public TNode(char value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "value=" + value;
    }

    public boolean hasChild(char ch) {
        return children.containsKey(ch);
    }

    public void addChild(char ch) {
        children.put(ch, new TNode(ch));
    }

    public void removeChild(char ch) {
        children.remove(ch);
    }

    public TNode getChild(char ch) {
        return children.get(ch);
    }

    public TNode[] getChildren() {
        return children.values().toArray(new TNode[0]);
    }

    public boolean hasChildren(char ch) {
        return !children.isEmpty();
    }
}
