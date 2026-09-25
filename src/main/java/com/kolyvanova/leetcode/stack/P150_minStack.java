package com.kolyvanova.leetcode.stack;

/**
 * 155. Min Stack
 * Medium
 */

public class P150_minStack {

    Node head;

    public void push(int value) {
        if (head == null)
            head = new Node(value, value, null);
        else {
            head = new Node(value, Math.min(head.min, value), head);
        }
    }

    public void pop() {
        head = head.left;
    }

    public int top() {
        return head.value;
    }

    public int getMin() {
        return head.min;
    }

    private class Node {
        int value;
        int min;
        Node left;

        private Node(int value, int min, Node left) {
            this.value = value;
            this.min = min;
            this.left = left;
        }
    }
}
