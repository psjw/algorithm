package _819_Most_Common_Word;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostCommonWord {
    public static void main(String[] args) {
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
    }

    private static String mostCommonWord(String paragraph, String[] banned) {
        String[] temp = paragraph.replaceAll("\\W+"," ").split(" ");
        Map<String, Long> resultMap = Arrays.stream(temp)
                .map(String::toLowerCase)
                .filter(x -> Arrays.stream(banned).noneMatch(b -> Objects.equals(b, x)))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return Collections.max(resultMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
