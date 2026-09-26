package com.kolyvanova.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 394. Decode String
 * Medium
 */

public class P394_decodeString {
    public String decodeString(String s) {
        Deque<Integer> nums = new ArrayDeque<>();
        Deque<String> text = new ArrayDeque<>();
        StringBuilder num = new StringBuilder();
        StringBuilder value = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num.append(ch);
            }
            else if (ch == '[') {
                nums.push(Integer.parseInt(num.toString()));
                num = new StringBuilder();
                text.push(value.toString());
                value.setLength(0);
            }
            else if (Character.isLetter(ch))
                value.append(ch);
            else if (ch == ']') {
                int count = nums.pop();
                String prefix = text.pop();
                String decoded = toDecode(count, value.toString());
                value = new StringBuilder(prefix).append(decoded);
            }
        }
        return value.toString();
    }

    private static String toDecode(int n, String s) {
        StringBuilder result = new StringBuilder();

        while (n > 0) {
            result.append(s);
            n--;
        }

        return result.toString();
    }
}
