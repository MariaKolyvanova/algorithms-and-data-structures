package com.kolyvanova.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 150. Evaluate Reverse Polish Notation
 * Medium
 */

public class P150_evaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String s : tokens) {
            if (isOperator(s)) {
                int right = stack.pop();
                int left = stack.pop();
                stack.push(parseExp(left, right, s));
            }
            else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

    private static boolean isOperator(String s) {
        return switch (s) {
            case "+", "-", "*", "/" -> true;
            default -> false;
        };
    }

    private static int parseExp(int op1, int op2, String operator) {
        return switch (operator) {
            case "+" -> op1 + op2;
            case "-" -> op1 - op2;
            case "*" -> op1 * op2;
            case "/" -> op1 / op2;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }
}
