package pccp.ch05;

import java.util.*;

public class Ex2Stack {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
        System.out.println(Arrays.toString(solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(solution(new int[]{99, 99, 99, 99, 99}, new int[]{99, 99, 99, 99, 99})));
        System.out.println(Arrays.toString(solution(new int[]{20, 99, 93, 30, 55, 10}, new int[]{5, 10, 1, 1, 30, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 99}, new int[]{99, 1})));
    }

    static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> result = new Stack<>();

        for (int i = 0; i < progresses.length; i++) {
            int remainsDay = 100 - progresses[i];
            int progressDay = (int) Math.ceil(Double.valueOf(remainsDay) / Double.valueOf(speeds[i]));
            if (!stack.isEmpty() && progressDay <= stack.peek()) {
                result.add(result.pop() + 1);
            } else {
                stack.add(progressDay);
                result.add(1);
            }
        }

        answer = new int[result.size()];
        for (int i = result.size() - 1; i >= 0; i--) {
            answer[i] = result.pop();
        }

        return answer;
    }


}
