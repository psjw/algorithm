package programmers.level0;

import java.util.Arrays;

public class 문자열계산하기 {
    public static void main(String[] args) {
        System.out.println(solution("3 + 4"));
        System.out.println(solution("1 - 20 + 30 - 4"));
        System.out.println(solution("3 + 4 - 5"));
    }

    public static int solution(String my_string) {
        int answer = 0;
        String[] calArr = my_string.split(" ");
        int preNum = Integer.parseInt(calArr[0]);
        int calculationNum = 0;
        String operator = "";
        for (int i = 1; i < calArr.length; i++) {

            if (calArr[i].equals('+') || calArr[i].equals('-')) {
                operator = calArr[i];
            } else  {
                calculationNum = calculate(preNum, Integer.parseInt(calArr[i]), operator);
                preNum = calculationNum;
                operator = "";
            }

        }
        answer = calculationNum;
        return answer;
    }

    private static int calculate(int preNum, int postNum, String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = preNum + postNum;
                break;
            case "-":
                result = preNum - postNum;
                break;
        }
        return result;
    }
}
