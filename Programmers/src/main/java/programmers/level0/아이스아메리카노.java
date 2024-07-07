package programmers.level0;

import java.util.Arrays;

public class 아이스아메리카노 {
    public static void main(String[] args) {
        System.out.println(solution( 5500)); //[1,0]
        System.out.println(solution(15000)); //[2,4000]
    }
    public static int[] solution(int money) {
        int[] answer = {};
        answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
    }
}
