package com.algorithm.boj.boj_1253;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main_1253 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            long[] arr = new long[N];
            int result = 0;
            arr = Arrays.stream(br.readLine().split(' ')).mapToLong(Long::parseLong).sorted().toArray();
            for(int i = 0; i< arr.length;i++){
                long findNum = arr[i];
                int k = 0;
                int j = N-1;
                while(k < j){
                    if(arr[k]+arr[j] == findNum){
                        if(k != i && j != i){
                            result++;
                            break;
                        }else if(j == i){
                            j--;
                        }else if(k == i ){
                            k++;
                        }
                    }else if(arr[k]+arr[j] <findNum){
                        k++;
                    }else{
                        j--;
                    }
                }

            }
            bw.write(result + '\n');
            bw.flush();
        }
    }
}
