package programmers.level0;

public class 두수의나눗셈 {
    public static void main(String[] args) {
        System.out.println(solution(3, 2)); //1500
        System.out.println(solution(7, 3)); //2333
        System.out.println(solution(1, 16)); //62

    }

    private static int solution(int num1, int num2) {
        int answer = 0;
        double divide = ((double) num1 / (double) num2)*1000;
        answer = (int)divide;
        return answer;
    }
}
