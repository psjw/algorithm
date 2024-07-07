package programmers.level0;

public class 나이출력 {
    public static void main(String[] args) {
        System.out.println(solution(40)); //1983
        System.out.println(solution(23)); //2000

    }

    private static int solution(int age) {
        int answer = 2022 - age + 1;

        return answer;
    }
}
