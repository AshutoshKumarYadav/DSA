package JPMorgan.Strings;

import java.util.ArrayList;
import java.util.List;

public class ZAlgorithm {


    void main(String[] args){
        String text = "ababcabc";
        String pattern = "abc";

        System.out.println(search(text, pattern));
    }
    // Find all pattern occurrences in text
    public static List<Integer> search(String text, String pattern){
        List<Integer> result = new ArrayList<>();
        if(pattern.isEmpty()){
            return result;
        }
        // Separator must not appear in pattern or text
        String combined = pattern + "#" + text;
        System.out.println("Combined : "+ combined);

        int[] z = buildZ(combined);
        int m = pattern.length();

        for(int i= m+1;i<combined.length();i++){
            if(z[i]==m){
                // Convert combined-string index to text index
                System.out.println(" i : "+i+": m : "+m+": i-m-1 : "+(i-m-1));
                result.add(i-m-1);

            }
        }
        return result;
    }
    // Build the Z-array
    public static int[] buildZ(String s){
        int n = s.length();
        int[] z =new int[n];

        int left = 0;
        int right = 0;
        for(int i=1;i<n;i++){
            // If i is inside the current Z-box
            if(i<=right){
                z[i] = Math.min(right-i+1,z[i-left]);
            }
            // Try extending the match
            while(i+z[i]<n && s.charAt(z[i])==s.charAt(i+z[i])){
                z[i]++;
            }
            // Update the Z-box
            if(i + z[i] - 1> right){
                left = 1;
                right = i +z[i] -1;
            }
        }
        return z;
    }
}
