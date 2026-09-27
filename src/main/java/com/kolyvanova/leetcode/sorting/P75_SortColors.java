package com.kolyvanova.leetcode.sorting;

import java.util.Random;

/**
 * 75. Sort Colors
 * Medium
 */

public class P75_SortColors {
    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private static void quickSort(int nums[], int left, int right) {
        if (left > right)
            return;

        int e = left; // equals
        int g = right; // greater
        int n = left; // now

        Random random = new Random();
        int pivot = nums[left + random.nextInt(right - left + 1)];

        while (n <= g) {
            if (nums[n] > pivot) {
                swap(nums, n, g);
                g--;
            }
            else if (nums[n] == pivot) {
                n++;
            }
            else {
                swap(nums, n, e);
                e++;
                n++;
            }
        }

        quickSort(nums, left, e - 1); // сортировка левой части
        quickSort(nums, g + 1, right); // сортировка правой части
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
