package programmers.level0;

public class 두수의차 {
    public static void main(String[] args) {
        System.out.println(solution(2, 3)); //-1
        System.out.println(solution(100, 2)); //98

    }

    private static int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }
}
