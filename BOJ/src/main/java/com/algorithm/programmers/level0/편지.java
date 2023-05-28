package com.algorithm.programmers.level0;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class 편지 {
    public static void main(String[] args) {
        System.out.println(solution("happy birthday!")); //30
        System.out.println(solution("I love you~")); //22

    }

    private static int solution(String message) {
        int answer = 0;

        answer = message.length() * 2;

        return answer;
    }
}
