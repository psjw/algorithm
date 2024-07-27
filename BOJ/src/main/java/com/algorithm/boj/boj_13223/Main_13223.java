package com.algorithm.boj.boj_13223;

import java.io.*;

public class Main_13223 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] nowTime = br.readLine().split(":");
            String[] targetTime = br.readLine().split(":");
            int nowSec = Integer.parseInt(nowTime[0]) * 3600
                    + Integer.parseInt(nowTime[1]) * 60
                    + Integer.parseInt(nowTime[2]);
            int targetSec = Integer.parseInt(targetTime[0]) * 3600
                    + Integer.parseInt(targetTime[1]) * 60
                    + Integer.parseInt(targetTime[2]);

            int diffSec = targetSec - nowSec;
            if(diffSec <= 0){
                diffSec += 24 * 3600;
            }

            int needHour = diffSec / 3600;
            int needMinute = (diffSec % 3600) / 60;
            int needSecond = diffSec % 60;
            System.out.printf("%02d:%02d:%02d", needHour, needMinute, needSecond);
        }
    }
}
