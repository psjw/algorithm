package programmers.level0;

public class 나머지구하기 {
    public static void main(String[] args) {
        System.out.println(solution(3, 2)); //1
        System.out.println(solution(10, 5)); //0

    }

    private static int solution(int num1, int num2) {
        int answer = num1 % num2;
        return answer;
    }
}
