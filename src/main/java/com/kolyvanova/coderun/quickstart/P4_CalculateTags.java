package com.kolyvanova.coderun.quickstart;

import java.io.*;

/**
 * 4. Выставление тегов
 */
public class P4_CalculateTags {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());

        long[] nums = new long[n + 2];
        nums[1] = 1;
        nums[2] = 1;

        long sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i >= 3) {
                nums[i] = nums[i - 1] + nums[i - 2];
            }
            sum += nums[i];
        }

        System.out.println(sum);

        reader.close();
        writer.close();
    }
}
