package com.algorithm.programmers.level0;

public class 숫자비교하기 {
    public static void main(String[] args) {
        System.out.println(solution(2, 3)); //-1
        System.out.println(solution(11,11)); //1
        System.out.println(solution(7,99)); //-1

    }

    private static int solution(int num1, int num2) {
        int answer = -1;
        if(num1 == num2){
            answer = 1;
        }
        return answer;
    }
}
