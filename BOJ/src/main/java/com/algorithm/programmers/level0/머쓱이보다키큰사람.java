package com.algorithm.programmers.level0;

import java.util.Arrays;

public class 머쓱이보다키큰사람 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{149, 180, 192, 170},167)); //3
        System.out.println(solution(new int[]{180, 120, 140},190)); //0
    }

    public static int solution(int[] array, int height) {
        int answer = 0;
        answer = (int)Arrays.stream(array).filter(x -> x > height).count();
        return answer;
    }
}
