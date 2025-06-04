package programmers.코딩테스트합격자되기;

import java.util.Stack;

public class 괄호회전하기 {
    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
        System.out.println(solution("}]()[{"));
        System.out.println(solution("[)(]"));
        System.out.println(solution("}}}"));
    }

    static int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        int N = s.length();
        s += s;
        for (int i = 0; i < N - 1; i++) {
            stack.clear();
            for (int j = i; j < i + N; j++) {
                if (stack.isEmpty()) {
                    stack.push(s.charAt(j));
                } else if(s.charAt(j) == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if(s.charAt(j) == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if(s.charAt(j) == ']' && stack.peek() == '[') {
                    stack.pop();
                }else{
                    stack.push(s.charAt(j));
                }
            }
            if (stack.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}
