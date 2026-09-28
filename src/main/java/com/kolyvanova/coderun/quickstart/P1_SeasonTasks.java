package com.kolyvanova.coderun.quickstart;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 1. Юля, Никита и задачи
 */
public class P1_SeasonTasks {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] lines = reader.readLine().trim().split("\\s+");
        long a = Long.parseLong(lines[0]);
        long b = Long.parseLong(lines[1]);
        writer.write(String.valueOf(a + b));

        reader.close();
        writer.close();
    }
}
