package JPMorgan.Strings;

public class LongestPalindrome {

    void main(String[] args){
        String s = "babad";
        System.out.println("LongestPalindrome : "+longestPalindrome(s));
    }

    public static String longestPalindrome(String s){
        if(s==null || s.length()==0){
            return s==null ? "":s;
        }
        int start = 0;
        int end = 0;

        for(int i =0; i<s.length();i++){
            // Odd-length palindrome: center is i
            int len1 = expand(s,i,i);

            // Even-length palindrome: center is between i and i + 1
            int len2 = expand(s,i,i+1);

            int len = Math.max(len1,len2);

            // Update longest palindrome boundaries
            if(len > end - start + 1){
                start = i-(len-1)/2;
                end = i+len/2;
            }




        }
        return s.substring(start,end+1);
    }

    // Expand while characters on both sides match
    public static int expand(String s, int left, int right){
            while(
                    left>=0 && right <s.length() && s.charAt(left) == s.charAt(right)
            ){
                left--;
                right++;

            }
        // Length of palindrome after expansion
        return right-left-1;
    }
}
