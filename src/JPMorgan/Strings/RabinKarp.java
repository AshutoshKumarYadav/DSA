package JPMorgan.Strings;

import java.util.ArrayList;
import java.util.List;

public class RabinKarp {



    void main(String[] args){
        String text = "ababcabc";
        String pattern = "abc";

        System.out.println(search(text,pattern));
    }


    public static List<Integer> search(String text, String pattern){
            List<Integer> result = new ArrayList<>();
            int n = text.length();
            int m = pattern.length();

            if(m == 0 || m > n){
                return result;
            }

            long base = 256;
            long mod = 1_000_000_007L;

            long patternHash = 0;
            long windowHash = 0;
            long highestPower = 1;

        // Calculate base^(m-1) % mod
            for(int i=1;i<m;i++){
                highestPower = (highestPower * base) % mod;
            }

        // Calculate hash of pattern and first window

        for(int i=0;i<m;i++){
            patternHash = (patternHash * base + pattern.charAt(i)) % mod;

            windowHash = (windowHash * base +text.charAt(i)) % mod;
        }

        //slide the window across the text
        for(int i =0;i<=n-m;i++){
            // Hash match: verify actual characters
            if(patternHash == windowHash  && text.regionMatches(i, pattern,0,m)){
                result.add(i);
            }

            // Calculate hash for the next window

            if(i<n-m){
                char outgoing = text.charAt(i);
                char incoming = text.charAt(i+m);

                // Remove the outgoing character
                windowHash = (windowHash - (outgoing  * highestPower)%mod + mod)% mod;

                // Shift left and add incoming character
                windowHash = (windowHash * base + incoming)% mod;
            }
        }
        return result;

    }
}
