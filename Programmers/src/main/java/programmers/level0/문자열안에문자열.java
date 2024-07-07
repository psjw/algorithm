package programmers.level0;

public class 문자열안에문자열 {
    public static void main(String[] args) {
        System.out.println(solution("ab6CDE443fgh22iJKlmn1o", "6CD")); //1
        System.out.println(solution("ppprrrogrammers", "pppp")); //2
        System.out.println(solution("AbcAbcA", "AAA")); //2
    }

    public static int solution(String str1, String str2) {
        int answer = 0;
        if (str1.indexOf(str2) >= 0) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}
