package JPMorgan.Strings;

public class LongestCommonPrefix {

    void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        System.out.println("LongestCommonPrefix : "+longestCommonPrefix(strs));
    }



    public static String longestCommonPrefix(String[] str){

        if(str ==null || str.length == 0){
            return "";
        }
        // Use the first string as the reference
        String first = str[0];
        for(int i=0;i<str.length;i++){
            char ch = first.charAt(i);
            // Compare this character with every other string
            for(int j=1;j< str.length;j++){
                // String is too short or character doesn't match
                if(i>=str[j].length() || str[j].charAt(i)!=ch){
                    return first.substring(0,i);
                }

            }
        }
        // All characters matched
        return first;
    }
}
