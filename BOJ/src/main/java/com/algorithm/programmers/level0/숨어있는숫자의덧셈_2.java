package com.algorithm.programmers.level0;

import java.util.Arrays;

public class 숨어있는숫자의덧셈_2 {
    public static void main(String[] args) {
        System.out.println(solution('aAb1B2cC34oOp')); //37
        System.out.println(solution('1a2b3c4d123')); //133
    }
    private static int solution(String my_string) {
        int answer = 0;
        answer = Arrays.stream(my_string.split('[a-z|A-Z]')).filter(x -> !x.isEmpty()).mapToInt(Integer::parseInt).sum();
        return answer;
    }

/*    private static int solution(String my_string) {
        int answer = 0;
        int sum =0;
        boolean isCheckDigit[] = new boolean[my_string.length()];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < my_string.length();i++){
            if(Character.isDigit(my_string.charAt(i))){
                isCheckDigit[i] = true;
            }
        }


        for(int i =0;i<my_string.length();i++){
            if(isCheckDigit[i]){
                sb.append(my_string.charAt(i));
            }else{
                if(sb.length()>0) sum += Integer.parseInt(sb.toString());
                sb.setLength(0);
            }
        }
        if(sb.length()>0){
            sum += Integer.parseInt(sb.toString());
        }
        answer = sum;
        return answer;
    }*/
}
