package com.kolyvanova.leetcode.queue;

/**
 * 622. Design Circular Queue
 * Medium
 */

public class P622_DesignCircularQueue {
    private class MyCircularQueue {

        int[] queue;
        int size;
        int head;
        int count;

        public MyCircularQueue(int k) {
            size = k;
            queue = new int[size];
            for (int i = 0; i < size; i++) {
                queue[i] = -1;
            }
            head = 0;
        }

        public boolean enQueue(int value) {
            if (isFull())
                return false;

            int tail = (head + count) % size;
            count++;
            queue[tail] = value;

            return true;
        }

        public boolean deQueue() {
            if (isEmpty())
                return false;

            head = (head + 1) % size;
            count--;

            return true;
        }

        public int Front() {
            return isEmpty() ? -1 : queue[head];
        }

        public int Rear() {
            if (isEmpty()) return -1;

            int tail = (head + count - 1) % size;
            return queue[tail];
        }

        public boolean isEmpty() {
            return count == 0;
        }

        public boolean isFull() {
            return count == size;
        }
    }
}
