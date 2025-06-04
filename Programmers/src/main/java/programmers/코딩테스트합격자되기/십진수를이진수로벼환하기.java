package programmers.코딩테스트합격자되기;

import java.util.Stack;

public class 십진수를이진수로벼환하기 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(27));
        System.out.println(solution(12345));
    }

    static String solution(int decimal) {
        Stack<Integer> stack = new Stack<>();
        while (decimal != 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal = decimal / 2;
        }
        int size = stack.size();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < size; i++) {
            answer.append(stack.pop());
        }
        return answer.toString();
    }
}
