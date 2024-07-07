package programmers.level0;

public class 주사위의개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 1}, 1)); //1
        System.out.println(solution(new int[]{10, 8, 6}, 3)); //12
    }

    public static int solution(int[] box, int n) {
        int answer = 0;
        int first = box[0] / n;
        int second = box[1] / n;
        int third = box[2] / n;
        answer = first * second * third;
        return answer;
    }
}
