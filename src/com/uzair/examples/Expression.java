package com.uzair.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
    private final List<Character> left = Arrays.asList('(', '{', '[', '<');
    private final List<Character> right = Arrays.asList(')', '}', ']', '>');
    public boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack<Character>();
        for (char ch : exp.toCharArray()) {
            if (isOpening(ch))
                stack.push(ch);
            if (isCLosing(ch)) {
                if (stack.empty())
                    return false;
                var top = stack.pop();
                if (!isMatching(ch, top))
                    return false;
            }
        }
        return stack.empty();
    }
    private boolean isOpening(char ch) {
        return left.contains(ch);
    }
    private boolean isCLosing(char ch) {
        return right.contains(ch);
    }
    private boolean isMatching(char ch, char top) {
        return left.indexOf(ch) == right.indexOf(top);
    }
}
