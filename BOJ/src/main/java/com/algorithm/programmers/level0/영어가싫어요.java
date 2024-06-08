package com.algorithm.programmers.level0;

import java.math.BigInteger;

public class 영어가싫어요 {
    public static void main(String[] args) {
        System.out.println(solution('onetwothreefourfivesixseveneightnine')); //123456789
        System.out.println(solution('onefourzerosixseven')); //14067
    }

    public static long solution(String numbers) {
        long answer = 0;
        String number = numbers.replaceAll('one', '1')
                .replaceAll('two', '2')
                .replaceAll('three', '3')
                .replaceAll('four', '4')
                .replaceAll('five', '5')
                .replaceAll('six', '6')
                .replaceAll('seven', '7')
                .replaceAll('eight', '8')
                .replaceAll('nine', '9')
                .replaceAll('zero','0');
        answer = Long.parseLong(number);

        return answer;
    }
}
