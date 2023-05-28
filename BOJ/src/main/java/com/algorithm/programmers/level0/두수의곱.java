package com.algorithm.programmers.level0;

public class 두수의곱 {
    public static void main(String[] args) {
        System.out.println(solution(3, 4)); //12
        System.out.println(solution(27, 19)); //513

    }

    private static int solution(int num1, int num2) {
        int answer = num1 * num2;
        return answer;
    }
}
