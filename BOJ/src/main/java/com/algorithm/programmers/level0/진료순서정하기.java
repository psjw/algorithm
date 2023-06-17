package com.algorithm.programmers.level0;

import java.util.HashSet;


public class 진료순서정하기 {
    public static void main(String[] args) {
        System.out.println(solution(12)); //[2,3]
        System.out.println(solution(17)); //[17]
        System.out.println(solution(420)); //[2,3,5,7]
    }

    public static int[] solution(int n) {
        int[] answer = {};
        HashSet<Integer> hSet = new HashSet<>();
        int i = 2;
        while(n != 1){
            if(n % i == 0){
                n = n/i;
                hSet.add(i);
                i = 2;
            }else{
                i++;
            }
        }
        answer = hSet.stream().sorted().mapToInt(x->x).toArray();
        return answer;
    }
}

