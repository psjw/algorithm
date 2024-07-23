package com.algorithm.boj.boj_1919;

import java.io.*;
public class Main_1919 {
    public static void main(String[] args) throws IOException {
         try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
             String word1 = br.readLine();
             String word2 = br.readLine();
             int[] count1 = addCharCount(word1);
             int[] count2 = addCharCount(word2);
             int sum = 0;
             for (int i = 0; i < 26; i++) {
                 sum += Math.abs(count1[i] - count2[i]);
             }

             bw.write(String.valueOf(sum));
             bw.flush();
         }
    }

    private static int[] addCharCount(String word) {
        int[] count = new int[26];
        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 'a']++;
        }
        return count;
    }


}
