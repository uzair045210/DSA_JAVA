package com.uzair.binary.Trie;

import java.util.ArrayList;
import java.util.List;

public class Trie {

    public static int ASCENDING = 1;
    public static int DESCENDING = 2;

    private TNode root = new TNode(' ');

    public void insert(String word) {
        var current = root;
        for (var ch : word.toCharArray()) {
            if (!current.hasChild(ch))
                current.addChild(ch);
            current = current.getChild(ch);
        }
        current.isEndOfWord = true;
    }

    public void remove(String word) {
        if (word == null)
            return;
        remove(root, word, 0);
    }
    private void remove(TNode root, String word, int index) {
        if (index == word.length()) {
            root.isEndOfWord = false;
            return;
        }
        var ch = word.charAt(index);
        var child = root.getChild(ch);
        if (child == null)
            return;
        remove(child, word, index + 1);
        if (!child.hasChildren(ch) && !child.isEndOfWord)
            root.removeChild(ch);
    }

    public boolean contains(String word) {
        if (word == null)
            return false;

        var current = root;
        for (var ch : word.toCharArray()) {
            if (!current.hasChild(ch))
                return false;
            current = current.getChild(ch);
        }
        return current.isEndOfWord;
    }

    public boolean containsRecursive(String word) {
        if (word == null)
            return false;
        return containsRecursive(root, word, 0);
    }

    private boolean containsRecursive(TNode root, String word, int index) {
        if (index == word.length())
            return root.isEndOfWord;
        if (root == null)
            return false;
        var ch = word.charAt(index);
        var child = root.getChild(ch);
        if (child == null)
            return false;
        return containsRecursive(child, word, index + 1);
    }

    public List<String> findWords(String prefix) {
        List<String> words = new ArrayList<>();
        var lastNode = findLastNodeOf(prefix);
        findWord(lastNode, prefix, words);
        return words;
    }

    private void findWord(TNode root, String prefix, List<String> words) {
        if (prefix == null)
            return;
        if (root.isEndOfWord)
            words.add(prefix);
        for (var child : root.getChildren())
            findWord(child, prefix + child.value, words);
    }

    private TNode findLastNodeOf(String prefix) {
        var current = root;
        for (var ch : prefix.toCharArray()) {
            var child = current.getChild(ch);
            if (child == null)
                return null;
            current = child;
        }
        return current;
    }

    public void traverse(int order) {
        if (order == 1)
            traversePre(root);
        else if (order == 2)
            traversePost(root);
    }

    private void traversePre(TNode root) {
        // Pre-order: visit the root last
        System.out.println(root.value);
        for (var child : root.getChildren())
            traversePre(child);
    }
    private void traversePost(TNode root) {
        for (var child : root.getChildren())
            traversePost(child);
        // Post-order: visit the root last
        System.out.println(root.value);
    }

    public int countWords() {
        return countWords(root);
    }

    private int countWords(TNode root) {
        var total = 0;
        if (root.isEndOfWord)
            total++;
        for (var child : root.getChildren())
            total += countWords(child);
        return total;
    }

    public String longestCommonPrefix(String[] words) {
        if (words == null)
            return "";
        var trie = new Trie();
        for (var word : words)
            trie.insert(word);
        var prefix = new StringBuffer();
        var maxChars = getShortest(words).length();
        var current = trie.root;
        while (prefix.length() < maxChars) {
            var children = current.getChildren();
            if (children.length != 1)
                break;
            current = children[0];
            prefix.append(current.value);
        }
        return prefix.toString();
    }

    private String getShortest(String[] words) {
        if (words == null || words.length == 0)
            return "";
        var shortest = words[0];
        for (var i = 1; i < words.length; i++)
            if (words[i].length() < shortest.length())
                shortest = words[i];
        return shortest;
    }

}















