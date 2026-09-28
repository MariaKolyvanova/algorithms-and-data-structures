package com.kolyvanova.coderun.quickstart;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * 3. Больше своих соседей
 */
public class P3_MoreYourNeighbors {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nums = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int count = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i-1] && nums[i] > nums[i+1])
                count++;
        }

        writer.write(String.valueOf(count));

        reader.close();
        writer.close();
    }
}
