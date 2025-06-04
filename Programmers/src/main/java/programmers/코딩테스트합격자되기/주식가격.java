package programmers.코딩테스트합격자되기;

import java.util.Arrays;
import java.util.Stack;

public class 주식가격 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 2, 3})));
    }


    static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < prices.length; i++) {
            int count = 0;
            for(int j = i+1; j < prices.length; j++) {
                count++;
                if(prices[i] > prices[j]) {
                    break;
                }
            }
            stack.push(count);
        }

        for (int i = prices.length-1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}
