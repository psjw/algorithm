package com.algorithm.boj.boj_1377;

import java.io.*;

public class Main_1377 {
    public static void main(String[] args) throws IOException {
        boolean changed = false;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(br.readLine());
            }

            for (int i = 0; i < N; i++) {
                changed = false;
                for (int j = 0; j <= N - i; j++) {
                    if(A[j] > A[j+1]){
                        changed = true;
                        int temp = A[j];
                        A[j] = A[j + 1];
                        A[j + 1] = temp;
                    }
                    if(changed == false){
                        System.out.println(i);
                        break;
                    }
                }
            }
        }

    }

}
