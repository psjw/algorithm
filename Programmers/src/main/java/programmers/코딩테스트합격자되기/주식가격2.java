package programmers.코딩테스트합격자되기;

import java.util.Arrays;
import java.util.Stack;

public class 주식가격2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 2, 3})));
    }


    static int[] solution(int[] prices) {
        int N = prices.length;
        int[] answer = new int[N];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < N; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int j = stack.pop();
                answer[j] = i - j;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int j = stack.pop();
            answer[j] = N - 1 - j;
        }


        return answer;
    }
}
