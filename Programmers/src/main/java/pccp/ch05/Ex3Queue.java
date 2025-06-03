package pccp.ch05;

import java.util.*;

public class Ex3Queue {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 2, 3})));
    }

    static int[] solution(int[] prices) {
        int[] answer = {};
        answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            int now = prices[i];
            int count = 0;
            for(int j = i + 1; j < prices.length; j++) {
                count++;
                if(prices[j] < now) {
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
