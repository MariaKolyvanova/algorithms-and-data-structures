package com.kolyvanova.leetcode.arrays;

import java.util.Arrays;

/**
 * 14. Longest Common Prefix
 * Easy
 */

public class P14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String pref = strs[0];
        for (int i = 1; i < strs.length; i++){
            while (!strs[i].startsWith(pref)) {
                if (pref.isEmpty())
                    return "";
                pref = pref.substring(0, pref.length() - 1);
            }
        }
        return pref;
    }
}
