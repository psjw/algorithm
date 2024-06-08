package com.algorithm.boj.boj_12891;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Main_12891 {
    static int result;
    static char[] arr;
    static int[] secretCntArr;

    static int[] nowCntArr;

    static Map<Character,Integer> secretMap = Map.of('A',0,'C',1,'G',2,'T',3);


    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(stk.nextToken());
            int P = Integer.parseInt(stk.nextToken());
            arr = new char[P];
            secretCntArr = new int[4];
            nowCntArr = new int[4];

            String secretStr = br.readLine();
            arr = secretStr.toCharArray();
            stk = new StringTokenizer(br.readLine());
            int count = 0;
            while(stk.hasMoreTokens()){
                secretCntArr[count] = Integer.parseInt(stk.nextToken());
                count++;
            }
            int size = 0;
            for(int i = 0 ; i<= arr.length;i++){
                if(size == P){
                    for(int j = 0; j <4 ;j++){
                        if(nowCntArr[j] < secretCntArr[j]){
                            break;
                        }
                        if(j == 3){
                            result++;
                        }
                    }
                }
                if(i == arr.length){
                    break;
                }
                //add
                if(size <= P){
                    nowCntArr[secretMap.get(arr[i])]++;
                    size++;
                }

                //remove
                if(size > P){
                    nowCntArr[secretMap.get(arr[i - P])]--;
                    size--;
                }
            }

            bw.write(result + '\n');
            bw.flush();

        }
    }
}
