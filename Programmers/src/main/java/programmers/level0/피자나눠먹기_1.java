package programmers.level0;

import java.util.HashSet;
import java.util.stream.IntStream;

public class 피자나눠먹기_1 {
    public static void main(String[] args) {
        System.out.println(solution(7)); //1
        System.out.println(solution(1)); //1
        System.out.println(solution(15)); //3
    }

    public static int solution(int n) {
        int answer = 0;
        int pizzaCnt = n / 7;
        if (n % 7 > 0) {
            pizzaCnt++;
        }
        answer = pizzaCnt;
        return answer;
    }
}
