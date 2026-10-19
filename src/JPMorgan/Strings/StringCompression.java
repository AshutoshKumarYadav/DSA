package JPMorgan.Strings;

public class StringCompression {

    void main(String[] args){
        String s ="aaabbcdddd";
        System.out.println("StringCompression : "+compress(s));
    }

    public static String compress(String s){
        StringBuilder result = new StringBuilder();
        int i=0;
        while(i<s.length()){
                char current = s.charAt(i);
                int count = 0;
            // Count consecutive occurrences
                while(i<s.length() && s.charAt(i)==current){
                    count++;
                    i++;
                }
            // Append character
                result.append(current);
            // Append count only when greater than 1
            if(count>1){
                result.append(count);
            }
        }
        return result.toString();
    }
}
