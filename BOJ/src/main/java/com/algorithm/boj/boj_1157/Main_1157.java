package com.algorithm.boj.boj_1157;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main_1157 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            char[] inputChar = br.readLine().toCharArray();
            Map<Character, Integer> resultMap = new HashMap<>();
            for (char temp : inputChar) {
                Integer value = resultMap.getOrDefault(Character.toLowerCase(temp), 0) + 1;
                resultMap.put(Character.toLowerCase(temp), value);
            }

            int max = resultMap.entrySet().stream().mapToInt(x -> x.getValue()).max().getAsInt();
            List<Character> reulstList = resultMap.entrySet().stream().filter(x -> x.getValue() == max)
                    .map(x -> Character.toLowerCase(x.getKey())).collect(Collectors.toList());
            if(reulstList.size() == 1){
                bw.write(String.valueOf(Character.toUpperCase(reulstList.get(0))));
            }else{
                bw.write("?");
            }
            bw.flush();
        }
    }
}
