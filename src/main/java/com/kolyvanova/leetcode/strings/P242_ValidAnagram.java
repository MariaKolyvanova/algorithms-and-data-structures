package com.kolyvanova.leetcode.strings;

import java.util.Arrays;

public class P242_ValidAnagram {
    static void main() {
        long start = System.currentTimeMillis();
        String s = "rat";
        String t = "car";

        System.out.println(isAnagram(s, t));

        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println("Выполнение заняло: " + duration + " мс");
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i])
                return false;
        }
        return true;
    }
}
