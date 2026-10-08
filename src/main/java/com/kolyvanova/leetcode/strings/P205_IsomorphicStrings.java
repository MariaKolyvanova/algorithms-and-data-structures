package com.kolyvanova.leetcode.strings;

import java.util.HashMap;

/**
 * 205. Isomorphic Strings
 * Easy
 */

public class P205_IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> map = new HashMap<>();
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(sc[i])) {
                if (map.get(sc[i]) != tc[i]) {
                    return false;
                }
            }
            else {
                if (map.containsValue(tc[i])) {
                    return false;
                }
                map.put(sc[i], tc[i]);
            }
        }

        return true;
    }
}
