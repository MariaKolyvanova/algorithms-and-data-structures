package com.kolyvanova.leetcode.strings;

/**
 * 13. Roman to Integer
 * Easy
 */

public class P13_RomanToInteger {
    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = parse(s.charAt(i));

            if (i + 1 < s.length()) {
                int next = parse(s.charAt(i + 1));

                if (current < next) {
                    result -= current;
                } else {
                    result += current;
                }
            } else {
                result += current;
            }
        }
        return result;
    }

    static int parse(char i) {
        return switch(i) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
