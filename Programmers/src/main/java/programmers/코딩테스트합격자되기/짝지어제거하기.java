package programmers.코딩테스트합격자되기;

import java.util.Stack;

public class 짝지어제거하기 {
    public static void main(String[] args) {
        System.out.println(solution("baabaa"));
        System.out.println(solution("cdcd"));
    }

    static int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.empty()){
                stack.push(c);
            } else if( c == stack.peek()){
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        if (stack.empty()){
            answer = 1;
        }

        return answer;
    }
}
