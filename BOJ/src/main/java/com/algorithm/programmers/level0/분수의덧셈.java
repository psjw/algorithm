package com.algorithm.programmers.level0;

public class 분수의덧셈 {
    public static void main(String[] args) {
        System.out.println(solution(1, 2, 3, 4)); //[5,4]
        System.out.println(solution(9, 2, 1, 3)); //[29,6]
        System.out.println(solution(1000, 2, 1000, 20)); //[29,6]
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        answer = new int[2];

        int molecule = (numer1 * denom2) + (numer2 * denom1);
        int denominator = denom1 * denom2;
        int max = 1;

        for (int i = 1; i <= molecule && i <= denominator; i++) {
            if (molecule % i == 0 && denominator % i == 0) {
                max = i;
            }
        }

        answer[0] = molecule / max;
        answer[1] = denominator / max;
        return answer;
    }
}
