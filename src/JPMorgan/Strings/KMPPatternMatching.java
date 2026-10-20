package JPMorgan.Strings;

public class KMPPatternMatching {

    public static void main(String[] args) {

        String text = "ababcabc";
        String pattern = "abc";

        System.out.println(search(text, pattern));
    }
    // Search for the pattern in the text
    public static int search(String text, String pattern){
       if(pattern.isEmpty()){
            return 0;
       }

       int n= text.length();
       int m= pattern.length();

       int[] lps = buildLPS(pattern);

       int i = 0;// index for text
        int j = 0; // Index for pattern

        while(i<n){
            if(text.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
                // Entire pattern matched
                if(j == m){
                    return i - j;
                }
            } else {
                if(j !=0){
                    j = lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return -1;

    }
    // Build the LPS array
    public static int[] buildLPS(String pattern){
        int m = pattern.length();
        int[] lps = new int[m];

        int length = 0;
        int i = 1;

        while(i<m){
            if(pattern.charAt(i)==pattern.charAt(length)){
                length++;
                lps[i] = length;
                i++;
            }else {
                if(length !=-0){
                    length = lps[length-1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

}
