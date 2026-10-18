package JPMorgan.Strings;

public class ReverseWords {
    public static void main(String[] args) {

        String s = "Java is very powerful";

        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s){
        // Remove leading and trailing spaces
        s = s.trim();

        // Handle empty string
        if(s.isEmpty()){
            return "";
        }
        // Split by one or more spaces
        String[] word = s.split("\\s+");
        StringBuilder strbuilder = new StringBuilder();
        // Traverse words from right to left
        for(int i=word.length-1;i>=0;i--){
            strbuilder.append(word[i]);

            // Add space between words
            if(i>0){
                strbuilder.append(" ");
            }
        }
        return strbuilder.toString();
    }
}
