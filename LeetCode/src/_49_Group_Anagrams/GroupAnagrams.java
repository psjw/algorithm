package _49_Group_Anagrams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> resultMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String temp = strs[i];
            String tempSorted = temp.chars().sorted().mapToObj(Character::toString).collect(Collectors.joining());
            if (resultMap.containsKey(tempSorted)) {
                resultMap.get(tempSorted).add(temp);
            }else{
                List<String> tempLists = new ArrayList<String>();
                tempLists.add(temp);
                resultMap.put(tempSorted, tempLists);
            }
        }
        return resultMap.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
    }

}
