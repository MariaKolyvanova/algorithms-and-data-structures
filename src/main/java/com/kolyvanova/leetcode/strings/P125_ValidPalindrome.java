package com.kolyvanova.leetcode.strings;

/**
 * 125. Valid Palindrome
 * Easy
 */

public class P125_ValidPalindrome {
    static void main() {
        long start = System.currentTimeMillis();
        String s = "Человек, план, канал: Панама";
        System.out.println(isPalindrome(s));
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println("Выполнение заняло: " + duration + " мс");
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);
            if (!Character.isLetterOrDigit(l)) {
                left++;
            }
            else if (!Character.isLetterOrDigit(r)) {
                right--;
            }
            else {
                if (Character.toLowerCase(l) != Character.toLowerCase(r))
                    return false;
                left++;
                right--;
            }
        }
        return true;
    }
}