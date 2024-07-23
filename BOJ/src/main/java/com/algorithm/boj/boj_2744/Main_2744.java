package com.algorithm.boj.boj_2744;

import java.io.*;

public class Main_2744 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            char[] originWord = br.readLine().toCharArray();
            StringBuilder sb = new StringBuilder();
            for(char tempWord : originWord){
                if(Character.isUpperCase(tempWord)){
                    sb.append(Character.toLowerCase(tempWord));
                }else{
                    sb.append(Character.toUpperCase(tempWord));
                }
            }

            bw.write(sb.toString());
            bw.flush();

        }
    }
}
