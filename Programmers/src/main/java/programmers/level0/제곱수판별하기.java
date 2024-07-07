package programmers.level0;

public class 제곱수판별하기 {
    public static void main(String[] args) {
        System.out.println(solution(144)); //1
        System.out.println(solution(976)); //2
    }

    public static int solution(int n) {
        int answer = 0;
        if (Math.sqrt(n) % 1 == 0) {
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }
}
