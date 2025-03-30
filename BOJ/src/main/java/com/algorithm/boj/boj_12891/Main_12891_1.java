package com.algorithm.boj.boj_12891;

import java.io.*;
import java.util.StringTokenizer;

public class Main_12891_1 {
    private static int S, P, answer;
    private static char[] arr;
    private static int checkArr[] = new int[4];
    private static int myArr[] = new int[4];

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            arr = new char[S];
            arr = br.readLine().toCharArray();

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < checkArr.length; i++) {
                checkArr[i] = Integer.parseInt(st.nextToken());
            }


            for (int i = 0; i < P; i++) {
                addArr(arr[i]);
            }
            if(validCheckArr()){
                answer++;
            }

            for (int i = P; i < S; i++) {
                int j = i - P;

                addArr(arr[i]);
                removeArr(arr[j]);
                if(validCheckArr()){
                    answer++;
                }

            }
            bw.write(String.valueOf(answer));
            bw.flush();

        }
    }

    private static boolean validCheckArr() {
        for(int j =0; j< myArr.length;j++){
            if(myArr[j] < checkArr[j]){
                return false;
            }
        }
        return true;
    }

    private static void addArr(char ch) {
        if (ch == 'A') {
            myArr[0]++;
        } else if (ch == 'C') {
            myArr[1]++;
        } else if (ch == 'G') {
            myArr[2]++;
        } else if (ch == 'T') {
            myArr[3]++;
        }
    }

    private static void removeArr(char ch) {
        if (ch == 'A') {
            myArr[0]--;
        } else if (ch == 'C') {
            myArr[1]--;
        } else if (ch == 'G') {
            myArr[2]--;
        } else if (ch == 'T') {
            myArr[3]--;
        }
    }
}
