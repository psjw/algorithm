package com.algorithm.programmers.level0;

import java.util.Arrays;

public class 짝수홀수개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5})); //[2,3]
        System.out.println(solution(new int[]{1, 3, 5, 7})); //[0,4]
    }

    public static int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[2];
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                answer[0]++;
            }else{
                answer[1]++;
            }
        }
        return answer;
    }
}
