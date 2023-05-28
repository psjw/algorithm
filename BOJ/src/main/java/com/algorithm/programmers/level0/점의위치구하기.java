package com.algorithm.programmers.level0;


import java.util.Arrays;

public class 점의위치구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 4})); //1
        System.out.println(solution(new int[]{-7, 9})); //2

    }

    private static int solution(int[] dot) {
        int answer = 0;
        if (dot[0] > 0 && dot[1] > 0) {
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        } else if (dot[0] > 0 && dot[1] < 0) {
            answer = 4;
        }
        return answer;
    }
}
