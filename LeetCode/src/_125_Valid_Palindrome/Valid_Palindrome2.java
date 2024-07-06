package _125_Valid_Palindrome;

import java.util.stream.Collectors;

public class Valid_Palindrome2 {
    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }

    private static boolean isPalindrome(String s) {
        String result = s.chars()
                .filter(Character::isLetterOrDigit)
                .map(Character::toLowerCase)
                .mapToObj(Character::toString)
                .collect(Collectors.joining());
        StringBuilder sb = new StringBuilder(result);
        return sb.toString().contentEquals(sb.reverse());
    }
}
