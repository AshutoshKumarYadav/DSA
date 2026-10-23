package JPMorgan.Strings;

public class WildcardMatching {


    public static void main(String[] args) {
        String s = "adceb";
        String p = "*a*b";

        System.out.println(isMatch(s, p)); // true
    }

    public static boolean isMatch(String s, String p){
        int i=0;// Pointer for string s
        int j=0;// Pointer for string p

        int star = -1; // position for the most recent '*'
        int match = 0; // String position matched by '*'

        while(i<s.length()){
            // Case 1: Characters match, or pattern has '?'
            if(j<p.length() &&
                    (p.charAt(j)==s.charAt(i)) || p.charAt(j)=='?'){
                i++;
                j++;
            }
            // Case 2: Pattern has '*'
            else if (j<p.length() && p.charAt(j)=='*'){
                star = j;
                match = i;
                j++;  // Initially, '*' matches an empty sequence
            }

            // Case 3: Mismatch, but a previous '*' exists
            else if(star!=-1){
                j = star+1;
                match++;
                i = match;
            }
            // Case 4: Mismatch and no '*' can help
            else{
                return false;
            }

        }
        // Remaining pattern characters must all be '*'
        while(j<p.length() && p.charAt(j)=='*'){
            j++;
        }
        return j == p.length();

    }



}
