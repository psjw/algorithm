package com.algorithm.boj.boj_12891;

import java.io.*;
import java.util.StringTokenizer;

public class Main_12891_1 {
    private static int S, P, answer;
    private static char[] arr;
    private static int count[] = new int[4];

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            arr = new char[S];
            String temp = br.readLine();
            for (int i = 0; i < temp.length(); i++) {
                arr[i] = temp.charAt(i) ;
            }
            for (int i = 0; i < count.length; i++) {
                st = new StringTokenizer(br.readLine());
                count[i] = Integer.parseInt(st.nextToken());
            }

            int start = 0;
            int end = start;

            for(int i = 0; i<S ;i++){

            }




        }
    }
}
