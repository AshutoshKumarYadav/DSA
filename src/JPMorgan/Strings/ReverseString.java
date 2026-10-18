package JPMorgan.Strings;

public class ReverseString {

    public static void main(String[] args) {

        String s = "hello";

        System.out.println(reverseString(s));
    }

    public static String reverseString(String s){
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length-1;
        while(left<right){
            // Store the left character temporarily
            char temp = chars[left];
            // Swap left and right characters
            chars[left] = chars[right];
            chars[right] = temp;

            // Move pointers towards the center
            left++;
            right--;


        }
        return new String(chars);
    }
}
