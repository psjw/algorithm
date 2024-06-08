package com.algorithm.programmers.level0;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class 컨트롤제트 {
    public static void main(String[] args) {
        System.out.println(solution('1 2 Z 3')); //4
        System.out.println(solution('10 20 30 40')); //100
        System.out.println(solution('10 Z 20 Z 1')); //1
        System.out.println(solution('10 Z 20 Z')); //0
        System.out.println(solution('-1 -2 -3 Z')); //-3
    }

    public static int solution(String s) {
        int answer = 0;
        AtomicInteger result = new AtomicInteger();
        AtomicInteger preTemp = new AtomicInteger();
        Arrays.stream(s.split(' ')).forEach(x -> {
            if ('Z'.equals(x)) {
                result.addAndGet(preTemp.get() * -1);
            } else {
                preTemp.set(Integer.parseInt(x));
                result.addAndGet(Integer.parseInt(x));
            }
        });
        answer = result.get();
        return answer;
    }
}
