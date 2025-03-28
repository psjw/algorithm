package com.algorithm.boj.boj_1546;

import java.io.*;
import java.util.StringTokenizer;

public class Main_1546_02 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            double maxSubject = 0;
            double sum = 0;
            double avg = 0;
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                double subject = Double.valueOf(st.nextToken());
                sum += subject;
                maxSubject = Math.max(maxSubject, subject);
            }
            avg = ((sum / maxSubject) * 100 ) / N;
            bw.write(String.valueOf(avg));
            bw.flush();
        }
    }
}
