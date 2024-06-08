package com.algorithm.boj.boj_10986;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

public class Main_10986 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw= new BufferedWriter( new OutputStreamWriter(System.out))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            long arr[] = new long[N + 1];
            long sumByEachArr[] = new long[N + 1];
            long countByReminderZero[] = new long[M];
            st = new StringTokenizer(br.readLine());
            StringTokenizer tempSt = st;
            IntStream.rangeClosed(1,N).forEach(index -> {
                arr[index] = Integer.parseInt(tempSt.nextToken());
                sumByEachArr[index] = sumByEachArr[index-1]+arr[index];
            });

            AtomicLong result = new AtomicLong();
            IntStream.rangeClosed(1, N).forEach(index -> {
                sumByEachArr[index] %= M;
                if(sumByEachArr[index] == 0)
                    result.getAndIncrement();
                countByReminderZero[(int)sumByEachArr[index]]++;
            });

            AtomicLong result2 = new AtomicLong();
            IntStream.range(0, M).forEach(index ->{
                if(countByReminderZero[index]>1){
                    result2.getAndAdd((countByReminderZero[index] * (countByReminderZero[index] - 1)) / 2);
                }
            });
            long ans = result.get() + result2.get();
            bw.write(ans+'\n');
            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
