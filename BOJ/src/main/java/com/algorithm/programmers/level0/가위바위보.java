package com.algorithm.programmers.level0;

import java.util.stream.IntStream;

public class 가위바위보 {
    public static void main(String[] args) {
        System.out.println(solution("2")); //'0'
        System.out.println(solution("205")); //'052'
    }

    public static String solution(String rsp) {
        String answer = "";
        //가위 2 , 바위 0 , 보 5
        StringBuilder sb = new StringBuilder();
        rsp.chars().mapToObj(Character::getNumericValue)
                .forEach(rspChar -> {
                    if(rspChar == 0){
                        sb.append(5);
                    }else if(rspChar == 5){
                        sb.append(2);
                    }else if(rspChar == 2){
                        sb.append(0);
                    }
                });
        answer = sb.toString();
        return answer;
    }
}
