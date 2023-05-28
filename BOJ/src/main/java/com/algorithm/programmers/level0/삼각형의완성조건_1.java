package com.algorithm.programmers.level0;

import java.util.Arrays;

public class 삼각형의완성조건_1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3})); //2
        System.out.println(solution(new int[]{3, 6, 2})); //2
        System.out.println(solution(new int[]{199, 72, 222})); //1
    }

    private static int solution(int[] sides) {
        int answer = 0;
        int[] sortedSides = Arrays.stream(sides).sorted().toArray();
        if(sortedSides[2] < sortedSides[0]+sortedSides[1]){
            answer = 1;
        }else {
            answer = 2;
        }
        return answer;
    }
}
