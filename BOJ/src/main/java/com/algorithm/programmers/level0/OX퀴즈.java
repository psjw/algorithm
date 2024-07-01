package com.algorithm.programmers.level0;

public class OX퀴즈 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"})); //['X', 'O']
        System.out.println(solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})); //['O', 'O', 'X', 'O']

    }

    public static String[] solution(String[] quiz) {
        String[] answer = {};
        answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] tempQuiz = quiz[i].split(" ");
           if(Integer.parseInt(tempQuiz[4]) == calculate(tempQuiz[0], tempQuiz[2], tempQuiz[1])){
                answer[i] = "O";
            }else{
                answer[i] = "X";
            }
        }
        return answer;
    }

    private static Integer calculate(String s0, String s2, String operator) {
        int tempS0 = Integer.parseInt(s0);
        int tempS2 = Integer.parseInt(s2);
        int result = 0;
        switch (operator) {
            case "+":
                result = tempS0 + tempS2;
                break;
            case "-":
                result = tempS0 - tempS2;
                break;
        }
        return result;
    }
}
