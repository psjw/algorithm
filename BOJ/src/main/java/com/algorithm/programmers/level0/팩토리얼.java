package com.algorithm.programmers.level0;

public class 팩토리얼 {
    public static void main(String[] args) {
        System.out.println(solution(3628800)); //10
        System.out.println(solution(7)); //3
    }

    public static int solution(int n) {
        int answer = 0;
        int temp = 1;
        for (int i = 1; i <= n; i++) {
            temp *= i;
            if(temp <= n){
                answer = i;
            }else{
                break;
            }
        }
        return answer;
    }
}
