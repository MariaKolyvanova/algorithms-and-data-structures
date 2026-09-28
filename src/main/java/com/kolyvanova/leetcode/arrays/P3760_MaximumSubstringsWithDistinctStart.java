package com.kolyvanova.leetcode.arrays;

import java.util.HashSet;

/**
 * 3760. Maximum Substrings With Distinct Start
 * Medium
 */

public class P3760_MaximumSubstringsWithDistinctStart {
    public int maxDistinct(String s) {
        HashSet<Character> set = new HashSet<>();
        for(char ch : s.toCharArray())
            set.add(ch);
        return set.size();
    }
}
