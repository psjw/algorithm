package com.algorithm.programmers.level0;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class k의개수 {
    public static void main(String[] args) {
        System.out.println(solution(1,13,1)); //6
        System.out.println(solution(10,50,5)); //5
        System.out.println(solution(3,10,2)); //0
    }
    public static int solution(int i, int j, int k) {
        int answer = 0;
        AtomicInteger count = new AtomicInteger();
        IntStream.rangeClosed(i, j)
                .forEach(x -> {
                    count.addAndGet((int)String.valueOf(x)
                            .chars()
                            .mapToObj(Character::toString)
                            .filter(y -> y.equals(String.valueOf(k)))
                            .count());
                });
        answer = count.get();
        return answer;
    }
}
