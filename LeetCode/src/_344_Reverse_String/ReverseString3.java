package _344_Reverse_String;

public class ReverseString3 {
    public static void main(String[] args) {
        ReverseString3 reverseString = new ReverseString3();
        reverseString.reverseString(new char[]{'h','e','l','l','o'});
        reverseString.reverseString(new char[]{'H','a','n','n','a','h'});
    }
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }
}
