package com.kolyvanova.leetcode;

import java.io.*;
import java.util.*;

public class Test {
    static void main() {
        long start = System.currentTimeMillis();
        String s = "";
        System.out.println(someMethod(s));


        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println("Выполнение заняло: " + duration + " мс");
    }

    public static char someMethod(String s){
        return 'b' - 'a';
    }

}