package _937_Recorder_Data_in_Log_Files;

import java.util.ArrayList;
import java.util.List;

public class RecorderLogFiles {
    public static void main(String[] args) {
        RecorderLogFiles reorderLogFiles = new RecorderLogFiles();
        reorderLogFiles.recorderLogFiles(new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"});
        reorderLogFiles.recorderLogFiles(new String[]{"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"});

    }
    public String[] recorderLogFiles(String[] logs) {
        List<String> digitList = new ArrayList<>();
        List<String> letterList = new ArrayList<>();

        for (String log : logs) {
            String[] splitLogs = log.split(" ", 2);
            if(Character.isDigit(splitLogs[1].charAt(0))){
                digitList.add(log);
            }else{
                letterList.add(log);
            }
        }

        letterList.sort((s1, s2) -> {
            String[] sc1 = s1.split(" ", 2);
            String[] sc2 = s2.split(" ", 2);

            int result = sc1[1].compareTo(sc2[1]);
            return result == 0 ? sc1[0].compareTo(sc2[0]) : result;
        });

        letterList.addAll(digitList);
        return letterList.toArray(new String[0]);
    }
}
