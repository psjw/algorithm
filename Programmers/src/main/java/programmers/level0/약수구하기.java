package programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class 약수구하기 {
    public static void main(String[] args) {
        System.out.println(solution(24)); //[1, 2, 3, 4, 6, 8, 12, 24]
        System.out.println(solution(29)); //[1, 29]
        System.out.println(solution(1)); //[1, 29]
        System.out.println(solution(25)); //[1, 29]
    }

    public static int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                list.add(n / i);
            }
        }
        answer = list.stream().mapToInt(x -> x).sorted().distinct().toArray();


        return answer;
    }
}
