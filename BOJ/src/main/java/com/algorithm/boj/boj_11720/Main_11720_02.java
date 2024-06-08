package com.algorithm.boj.boj_11720;

import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Main_11720_02 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            int N = Integer.parseInt(br.readLine());
            char[] numbers = br.readLine().toCharArray();
            AtomicInteger sum = new AtomicInteger();
            IntStream.range(0,N).forEach(index -> {
                sum.addAndGet(Integer.parseInt(String.valueOf(Character.valueOf(numbers[index]))));
            });
            bw.write(sum.toString()+'\n');
            bw.flush();
        }
    }
}
