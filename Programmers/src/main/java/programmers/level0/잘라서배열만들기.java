package programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 잘라서배열만들기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abc1Addfggg4556b",6))); //['abc1Ad', 'dfggg4', '556b']
        System.out.println(Arrays.toString(solution("abc1Addfggg4556b",1))); //['abc1Addfggg4556b']
        System.out.println(Arrays.toString(solution("abcdef123",3))); //['abc', 'def', '123']
    }

    public static String[] solution(String my_str, int n) {
        String[] answer = {};
        int count = 0;
        int N = (int) Math.ceil(Math.ceil((double) my_str.length() / (double) n));
        int index = 0;
        answer = new String[N];
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < my_str.length(); i++){
            if(count == n){
                answer[index] = sb.toString();
                sb.setLength(0);
                count = 0;
                index++;
            }
            sb.append(my_str.charAt(i));
            count++;
        }
        if(sb.length()>0){
            answer[N-1] = sb.toString();
        }


        return answer;
    }
}
