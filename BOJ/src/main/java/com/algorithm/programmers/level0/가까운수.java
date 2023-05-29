package com.algorithm.programmers.level0;

import java.util.Arrays;

public class 가까운수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 10, 28}, 20)); //28
        System.out.println(solution(new int[]{10, 11, 12}, 13)); //12
    }

    public static int solution(int[] array, int n) {
        int answer = 0;
        int diffMin = Arrays.stream(array).map(x -> Math.abs(x - n)).min().getAsInt();
        answer = Arrays.stream(array).filter(x -> Math.abs(x - n) == diffMin).min().getAsInt();
        return answer;
    }
}
