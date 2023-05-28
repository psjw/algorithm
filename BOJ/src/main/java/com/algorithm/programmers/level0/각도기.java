package com.algorithm.programmers.level0;

public class 각도기 {
    public static void main(String[] args) {
        System.out.println(solution(70)); //1
        System.out.println(solution(91)); //3
        System.out.println(solution(180)); //4

    }

    private static int solution(int angle) {
        int answer = 0;

        if (0 < angle && angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle > 90 && angle < 180) {
            answer = 3;
        } else if (angle == 180) {
            answer = 4;
        }

        return answer;
    }
}
