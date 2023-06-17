package com.algorithm.programmers.level0;

public class 구슬을나누는경우의수 {
    public static void main(String[] args) {
        System.out.println(solution(3, 2)); //3
        System.out.println(solution(5, 3)); //10
    }

    public static int solution(int balls, int share) {
        int answer = 0;
        answer = combination(balls, share);
        return answer;
    }

    private static int combination(int balls, int share) {
        if(balls == share || share == 0){
            return 1;
        }
        return combination(balls - 1, share - 1) + combination(balls - 1, share);
    }

}
