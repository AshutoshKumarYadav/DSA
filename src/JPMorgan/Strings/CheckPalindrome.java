package JPMorgan.Strings;

public class CheckPalindrome {

    public static void main(String[] args) {

        String s = "madam";

        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s){
        int left =0;
        int right = s.length()-1;

        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            // Move pointers towards the center
            left++;
            right--;
        }
        return true;
    }

}
