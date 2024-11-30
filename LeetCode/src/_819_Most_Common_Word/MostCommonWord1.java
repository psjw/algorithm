package _819_Most_Common_Word;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MostCommonWord1 {
    public static void main(String[] args) {
        MostCommonWord1 mostCommonWord1 = new MostCommonWord1();
        System.out.println(mostCommonWord1.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
        System.out.println(mostCommonWord1.mostCommonWord("a.", new String[]{""}));
        System.out.println(mostCommonWord1.mostCommonWord("a, a, a, a, b,b,b,c, c", new String[]{"a"}));
    }

    public String mostCommonWord(String paragraph, String[] banned) {
        String[] paragraphArr = paragraph.replaceAll("\\W+", " ").split(" ");
        Map<String, Long> resultMap = Arrays.stream(paragraphArr)
                .map(k -> k.replaceAll("\\W+", " "))
                .filter(x -> Arrays.stream(banned).noneMatch(x::equals))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return resultMap.entrySet().stream().min(Collections.reverseOrder(Map.Entry.comparingByValue())).get().getKey();

    }
}
