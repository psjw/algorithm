package _125_Valid_Palindrome;

import java.util.stream.Collectors;

public class Valid_Palindrome4 {
    public static void main(String[] args) {
        Valid_Palindrome4 validPalindrome = new Valid_Palindrome4();
        System.out.println(validPalindrome.isPalindrome("abcdcba"));;
        System.out.println(validPalindrome.isPalindrome("abcdcba"));;
        System.out.println(validPalindrome.isPalindrome("dog"));
        System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
    public boolean isPalindrome(String s) {
        String result = s.chars().filter(Character::isLetterOrDigit)
                .map(Character::toLowerCase)
                .mapToObj(Character::toString)
                .collect(Collectors.joining());
        StringBuilder sb = new StringBuilder(result);
        return sb.toString().contentEquals(sb.reverse());
    }
}
