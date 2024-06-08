package com.algorithm.programmers.level0;

import java.util.stream.IntStream;

public class 암호해독 {
    public static void main(String[] args) {
        System.out.println(solution('dfjardstddetckdaccccdegk', 4)); //'attack'
        System.out.println(solution('pfqallllabwaoclk', 2)); //'fallback'
    }

    public static String solution(String cipher, int code) {
        String answer = '';
        StringBuilder sb = new StringBuilder();

        IntStream.range(0, cipher.length())
                .filter(index -> (index+1)%code == 0)
                .forEach(x -> sb.append(cipher.charAt(x)));
        answer = sb.toString();
        return answer;
    }
}
