package _937_Recorder_Data_in_Log_Files;

import java.util.ArrayList;
import java.util.List;

public class RecorderLogFiles3 {
    public static void main(String[] args) {
        RecorderLogFiles3 re = new RecorderLogFiles3();
        re.reorderLogFiles(new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"});
        re.reorderLogFiles(new String[]{"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"});
    }

    public String[] reorderLogFiles(String[] logs) {
        List<String> letterList = new ArrayList<>();
        List<String> digitList = new ArrayList<>();

        for (String log : logs) {
            if (Character.isDigit(log.split(" ")[1].charAt(0))) {
                digitList.add(log);
            } else {
                letterList.add(log);
            }
        }
        letterList.sort((s1, s2) -> {
            String[] s1x = s1.split(" ", 2);
            String[] s2x = s2.split(" ", 2);
            int compared = s1x[1].compareTo(s2x[1]);
            if(compared == 0) {
                return s1x[0].compareTo(s2x[0]);
            }else{
                return compared;
            }
        });
        letterList.addAll(digitList);

        return letterList.toArray(new String[0]);
    }
}
