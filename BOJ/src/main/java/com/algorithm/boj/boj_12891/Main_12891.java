package com.algorithm.boj.boj_12891;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Optional;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main_12891 {
    static int checkCount;
    static int result;
    static char[] arr;
    static int[] secretArr;

    static int[] nowArr;


    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(stk.nextToken());
            int P = Integer.parseInt(stk.nextToken());
            arr = new char[S];
            secretArr = new int[P];
            nowArr = new int[P];
            result = 0;
            checkCount = 0;
            arr = br.readLine().toCharArray();
            stk = new StringTokenizer(br.readLine());
            StringTokenizer tmpStk = stk;

            IntStream.range(0, P).forEach(index -> {
                secretArr[index] = Integer.parseInt(tmpStk.nextToken());
                if (secretArr[index] == 0)
                    checkCount++;
            });
            IntStream.range(0, P).forEach(index -> {
                Add(arr[index]);
            });
            if (checkCount == 4) {
                result++;
            }

            for (int i = P; i < S; i++) {
                int j = i - P;
                Add(arr[j]);
                Remove(arr[j]);
                if (checkCount == 4) {
                    result++;
                }
            }
            bw.write(result + "\n");
            bw.flush();


        }
    }

    private static void Remove(char c) {
        Arrays.stream(CheckCharacter.values())
                .filter(checkCharacter -> checkCharacter.getCheckChar() == c)
                .forEach(checkCharacter -> {
                    if (nowArr[checkCharacter.getCheckCharIndex()] == secretArr[checkCharacter.getCheckCharIndex()]){
                        checkCount++;
                    }
                    nowArr[checkCharacter.getCheckCharIndex()]--;
                });

    }

    private static void Add(char c) {
        Arrays.stream(CheckCharacter.values())
                .filter(checkCharacter -> checkCharacter.getCheckChar() == c)
                .forEach(checkCharacter -> {
                    nowArr[checkCharacter.getCheckCharIndex()]++;
                    if (nowArr[checkCharacter.getCheckCharIndex()] == secretArr[checkCharacter.getCheckCharIndex()]) {
                        checkCount++;
                    }
                });

    }

    public enum CheckCharacter {
        A('A', 0),
        B('B', 1),
        C('C', 2),
        D('D', 3);

        private char checkChar;
        private int checkCharIndex;

        CheckCharacter(char checkChar, int checkCharIndex) {
            this.checkChar = checkChar;
            this.checkCharIndex = checkCharIndex;
        }

        public char getCheckChar() {
            return checkChar;
        }

        public int getCheckCharIndex() {
            return checkCharIndex;
        }
    }

}
