package com.algorithm.programmers.level0;

import java.util.Stack;
import java.util.stream.IntStream;

public class 자릿수더하기 {
    public static void main(String[] args) {
        System.out.println(solution(1234)); //10
        System.out.println(solution(930211)); //16
    }

    private static int solution(int n) {
        int answer = 0;
        answer = String.valueOf(n).chars().mapToObj(Character::toString).mapToInt(Integer::parseInt).sum();
        return answer;
    }
}
