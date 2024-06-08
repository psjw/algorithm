package com.algorithm.boj.boj_1940;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main_1940 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            int M = Integer.parseInt(br.readLine());
            int startIdx = 1;
            int endIdx = N;
            int count = 0;
            long sum = 0;
            int arr[] = new int[N + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            IntStream.rangeClosed(1, N).forEach(index -> {
                arr[index] = Integer.parseInt(st.nextToken());
            });
            int[] soredArr = Arrays.stream(arr).sorted().toArray();
            //  sum = arr[startIdx] + arr[endIdx];
            while(startIdx < endIdx){
                if(soredArr[startIdx] + soredArr[endIdx] == M){
                    count++;
                    startIdx++;
                    continue;
                }
                if(soredArr[startIdx] + soredArr[endIdx] > M){
                    endIdx--;
                    continue;
                }
                if(soredArr[startIdx] + soredArr[endIdx] < M){
                    startIdx++;
                }
            }

            bw.write(count + '\n');
            bw.flush();
        }
    }
}
