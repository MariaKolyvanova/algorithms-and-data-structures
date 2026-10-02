package com.kolyvanova.leetcode.arrays;

import java.util.Arrays;

/**
 * 27. Remove Element
 * Easy
 */

public class P27_RemoveElement {
    static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}