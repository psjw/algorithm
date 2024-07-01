package com.algorithm.boj.boj_11659;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Main_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputInfo = br.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(inputInfo);
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int arr[] = new int[N+1];
        int[] sumByEachArr = new int[N+1];
        AtomicInteger min = new AtomicInteger();
        AtomicInteger max = new AtomicInteger();

        String tempInputArr = br.readLine();
        StringTokenizer arrStringTokenizer = new StringTokenizer(tempInputArr);
        IntStream.rangeClosed(1, N).forEach(index -> {
            arr[index] = Integer.parseInt(arrStringTokenizer.nextToken());
            sumByEachArr[index] = sumByEachArr[index - 1] + arr[index];
        });


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, "utf-8"));
        IntStream.range(0, M).forEach(index -> {
            try {
                StringTokenizer questionStringTokenizer = new StringTokenizer(br.readLine());
                min.set(Integer.parseInt(questionStringTokenizer.nextToken()));
                max.set(Integer.parseInt(questionStringTokenizer.nextToken()));
                int sum = sumByEachArr[max.get()] - sumByEachArr[min.get()-1];
                bw.write(sum+'\n');
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        bw.flush();
        bw.close();

    }
}
