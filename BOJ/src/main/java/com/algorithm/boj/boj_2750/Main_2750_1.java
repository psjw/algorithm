package com.algorithm.boj.boj_2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main_2750_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        IntStream.range(0, N).forEach(index ->
        {
            try {
                arr[index] = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N ; j++) {
                int temp = arr[j];
                if (temp < arr[i]) {
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
