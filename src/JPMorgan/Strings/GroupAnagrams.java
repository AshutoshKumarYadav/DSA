package JPMorgan.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    void main(String[] args){
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>>  result = groupAnagrams(strs);
        System.out.println("GroupAnagrams : "+result);
    }

    public static List<List<String>> groupAnagrams(String[] str){
        // Key = character frequency
        // Value = words having that frequency
        Map<String,List<String>> map = new HashMap<>();

        for(String word : str){
            // Store frequency of each character
            int[] frequency = new int[26];
            for(char ch : word.toCharArray()){
                frequency[ch-'a']++;
            }

            // Convert frequency array into a unique string key
            StringBuilder key = new StringBuilder();

            // Add word to its corresponding group
            for(int count : frequency){
                key.append('#').append(count);
            }
            map.computeIfAbsent(
                    key.toString(),
                    k->new ArrayList<>()).add(word);

        }
        // Return all anagram groups
        return new ArrayList<>(map.values());
    }
}
