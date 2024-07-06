package _937_Recorder_Data_in_Log_Files;

import java.util.ArrayList;
import java.util.List;

public class ReorderLogFiles2 {
    public static void main(String[] args) {
        reorderLogFiles(new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"});
        reorderLogFiles(new String[]{"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"});

    }
    private static String[] reorderLogFiles(String[] logs) {
        List<String> digits = new ArrayList<>();
        List<String> letters = new ArrayList<>();

        for (String log : logs) {
            String[] temp = log.split(" ");
            if(Character.isDigit(temp[1].charAt(0))){
                digits.add(log);
            }else{
                letters.add(log);
            }
        }

        letters.sort((s1, s2) ->{
            String[] st1 = s1.split(" ", 2);
            String[] st2 = s2.split(" ", 2);
            int compared = st1[1].compareTo(st2[1]);
            if(compared == 0){
                return st1[0].compareTo(st2[0]);
            }else{
                return compared;
            }
        });

        letters.addAll(digits);

        return letters.toArray(new String[0]);
    }

}
