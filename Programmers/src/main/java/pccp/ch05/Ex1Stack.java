package pccp.ch05;

import java.util.Stack;

public class Ex1Stack {
    public static void main(String[] args) {
        System.out.println(solution("()()"));
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
        System.out.println(solution("(()("));
    }

    static boolean solution(String s) {
        boolean answer = true;
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i) + "");
            }else if (stack.isEmpty() && s.charAt(i) == ')') {
                return false;
            } else {
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }

        return answer;
    }
}
