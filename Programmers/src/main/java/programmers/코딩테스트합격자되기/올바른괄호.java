package programmers.코딩테스트합격자되기;

import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) {
        System.out.println(solution("()()"));
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
        System.out.println(solution("(()("));
    }


    static boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '('){
                stack.push(c);
            } else if( !stack.isEmpty() && c == ')'){
                stack.pop();
            } else {
                return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return answer;
    }
}
