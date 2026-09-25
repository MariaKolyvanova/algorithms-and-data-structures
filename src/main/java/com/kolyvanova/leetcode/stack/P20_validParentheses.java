package com.kolyvanova.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 20. valid-parentheses
 * Easy
 */

public class P20_validParentheses {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (isOpenBracket(ch))
                stack.push(ch);
            else {
                if (stack.isEmpty())
                    return false;
                if (checkPairBrackets(stack.peek(), ch))
                    stack.pop();
                else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isOpenBracket(char ch) {
        return ch == '(' || ch == '[' || ch == '{';
    }

    private static boolean checkPairBrackets(char ch1, char ch2) {
        return ch1 == '(' && ch2 == ')' || ch1 == '[' && ch2 == ']' || ch1 == '{' && ch2 == '}';
    }
}
