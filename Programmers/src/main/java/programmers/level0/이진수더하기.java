package programmers.level0;

import java.math.BigInteger;

public class 이진수더하기 {
    public static void main(String[] args) {
        System.out.println(solution("10","11")); //'101'
        System.out.println(solution("1001","1111")); //'11000'
    }

    public static String solution(String bin1, String bin2) {
        String answer = "";
        BigInteger binary1 = new BigInteger(bin1, 2);
        BigInteger binary2 = new BigInteger(bin2, 2);

        BigInteger addBinary = binary1.add(binary2);

        answer = addBinary.toString(2);

        return answer;
    }
}
