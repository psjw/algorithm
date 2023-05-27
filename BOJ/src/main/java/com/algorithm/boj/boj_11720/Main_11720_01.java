package com.algorithm.boj.boj_11720;

import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main_11720_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String numbers = br.readLine();
        AtomicInteger sum = new AtomicInteger();
        numbers.chars().forEach(number -> {
            sum.addAndGet(Integer.parseInt(Character.toString(number)));
        });
        System.out.println(sum.get());
    }
}
