package _125_Valid_Palindrome;

public class Valid_Palindrome3 {
    public static void main(String[] args) {
        Valid_Palindrome3 validPalindrome = new Valid_Palindrome3();
        System.out.println(validPalindrome.isPalindrome("abcdcba"));;
        System.out.println(validPalindrome.isPalindrome("abcdcba"));;
        System.out.println(validPalindrome.isPalindrome("dog"));
        System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println((int) 'a');
        System.out.println((int) 'z');
    }

    public boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            } else if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }else if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
}
