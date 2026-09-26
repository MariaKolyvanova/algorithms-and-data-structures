package com.kolyvanova.leetcode.queue;

import java.util.Stack;

/**
 * 232. Implement Queue using Stacks
 * Easy
 */

public class P232_ImplementQueueUsingStacks {
    private class MyQueue {

        Stack<Integer> left;
        Stack<Integer> right;

        public MyQueue() {
            left = new Stack<>();
            right = new Stack<>();
        }

        public void push(int x) {
            right.push(x);
        }

        public int pop() {
            if (left.isEmpty())
                move();
            return left.pop();
        }

        public int peek() {
            if (left.isEmpty())
                move();
            return left.peek();
        }

        public boolean empty() {
            return left.isEmpty() && right.isEmpty();
        }

        private void move() {
            while (!right.isEmpty())
                left.push(right.pop());
        }
    }
}
