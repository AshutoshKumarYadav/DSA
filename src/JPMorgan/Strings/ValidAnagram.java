package JPMorgan.Strings;

public class ValidAnagram {

    public static void main(String[] args) {

        String s = "listen";
        String t = "silent";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t){
        // Anagrams must have the same length
        if(s.length() != t.length()){
            return false;
        }
        // Frequency array for 26 lowercase letters
        int[] frequency = new int[26];

        // Count characters in s
        for(int i=0;i<s.length();i++){
            frequency[s.charAt(i)-'a']++;
        }
        // Decrease counts using characters in t
        for(int i=0;i<t.length();i++){
            frequency[s.charAt(i)-'a']--;
            // A negative count means t has an extra character
            if(frequency[t.charAt(i)-'a']<0){
                return false;
            }
        }
        return true;
    }
}
