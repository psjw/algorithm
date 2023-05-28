package com.algorithm.programmers.level0;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class 짝수의합 {
    public static void main(String[] args) {
        System.out.println(solution(10)); //30
        System.out.println(solution(4)); //6

    }

    private static int solution(int n) {
        int answer = 0;
        AtomicInteger sum = new AtomicInteger();
        IntStream.rangeClosed(0, n).forEach(index ->{
            if(index%2 == 0){
                sum.addAndGet(index);
            }
        });

        answer = sum.get();
        return answer;
    }
}
