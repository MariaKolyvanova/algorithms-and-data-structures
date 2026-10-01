package com.kolyvanova.leetcode.arrays;

import java.util.Arrays;

/**
 * 26. Remove Duplicates from Sorted Array
 * Easy
 */

public class P26_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}