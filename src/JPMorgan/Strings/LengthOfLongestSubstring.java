package JPMorgan.Strings;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {

    void main(String[] args){
        String s = "abcabcbb";
        System.out.println("LengthOfLongestSubstring : "+lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s){
        Map<Character,Integer> lastseen = new HashMap<>();

        int left =0;
        int maxlength = 0;
        for(int right =0;right<s.length();right++){
            char ch = s.charAt(right);
            // Check whether this character was already seen
            if(lastseen.containsKey(ch)){
                // Move left only if the previous occurrence
                // is inside the current window
                 left = Math.max(left,lastseen.get(ch)+1);
            }
            // Store the latest index of this character
            lastseen.put(ch,right);
            // Calculate current window length
            int currentLength = right-left+1;
            // Update maximum length
            maxlength = Math.max(maxlength,currentLength);
        }
        return maxlength;
    }
}
