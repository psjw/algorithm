package programmers.level0;

public class 피자나눠먹기_3 {
    public static void main(String[] args) {
        System.out.println(solution(7,10)); //2
        System.out.println(solution(4,12)); //3
    }

    public static int solution(int slice, int n) {
        int answer = 0;
        answer = (n + slice - 1) / slice;
        return answer;
    }
}
