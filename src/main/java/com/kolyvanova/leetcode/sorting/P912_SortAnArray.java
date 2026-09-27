package com.kolyvanova.leetcode.sorting;

/**
 * 912. Sort an Array
 * Medium
 */

public class P912_SortAnArray {
    public int[] sortArray(int[] nums) {
        int[] temp = new int[nums.length];
        partition(nums, temp, 0, nums.length);

        return nums;
    }

    private static void partition(int[] nums, int[] temp, int left, int right) {
        if (right - left <= 1) { // Если в части 0 или 1 элемент — она уже отсортирована
            return;
        }

        int mid = left + (right - left) / 2; // Делим текущую часть примерно пополам
        partition(nums, temp, left, mid); // Рекурсивно сортируем левую часть
        partition(nums, temp , mid, right); // Рекурсивно сортируем правую часть

        merge(nums, temp, left, mid, right); // Сливаем две отсортированные части
    }

    private static void merge(int[] nums, int[] temp, int left, int mid, int right) {
        int i = left; // Указатель на левую часть
        int j = mid; // Указатель на правую часть
        int x = left; // Указатель на результат

        // Пока обе части не закончились
        while (i != mid && j != right) {
            if (nums[i] < nums[j]) {
                temp[x++] = nums[i++];
            }
            else {
                temp[x++] = nums[j++];
            }
        }

        // Копируем оставшиеся элементы левой части
        while (i < mid)
            temp[x++] = nums[i++];

        // Копируем оставшиеся элементы правой части
        while (j < right)
            temp[x++] = nums[j++];

        // Переносим результат обратно в исходный массив
        for (int k = left; k < right; k++) {
            nums[k] = temp[k];
        }
    }
}
