package com.algorithm.boj.boj_1543;

import java.io.*;

public class Main_1543 {
    public static void main(String[] args) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String inputStr = br.readLine();
            String searchStr = br.readLine();
            int count = 0;
            while (true){

                int idx = inputStr.indexOf(searchStr);
                if(idx == -1){
                    break;
                }
                inputStr = inputStr.substring(idx + searchStr.length(), inputStr.length() );
                count++;
            }

            bw.write(String.valueOf(count));
            bw.flush();
        }
    }
}
