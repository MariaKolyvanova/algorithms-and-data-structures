package com.kolyvanova.leetcode.queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 933. Number of Recent Calls
 * Easy
 */

public class P933_numberOfRecentCalls {
    private class RecentCounter {

        Deque<Integer> queue;

        public RecentCounter() {
            queue = new ArrayDeque<>();
        }

        public int ping(int t) {
            queue.addLast(t);

            while (queue.peekFirst() < t - 3000) {
                queue.pollFirst();
            }

            return queue.size();
        }
    }
}
