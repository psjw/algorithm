package com.algorithm.programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class 숫자찾기 {
    public static void main(String[] args) {
        System.out.println(solution(29183, 1)); //3
        System.out.println(solution(232443, 4)); //4
        System.out.println(solution(123456, 7)); //-1
    }

    public static int solution(int num, int k) {
        int answer = 0;
        answer = String.valueOf(num).indexOf(String.valueOf(k));
        if(answer > -1){
            answer++;
        }

        return answer;
    }
}
