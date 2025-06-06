package programmers.코딩테스트합격자되기;

import java.util.Arrays;
import java.util.Stack;

public class 같은숫자는싫어
{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,1,3,3,0,1,1})));
        System.out.println(Arrays.toString(solution(new int[]{4,4,4,3,3})));
    }

    static int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }
        answer = stack.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
