package JPMorgan.Strings;

public class CountVowels {

    void main(String[] arr){
        String str = "Hello world";
        System.out.println("Vowel count :"+countVowel(str));
    }

    public static int countVowel(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch =='a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u' || ch == 'A'
            || ch == 'E' || ch == 'I' || ch =='O'
            || ch == 'U'){
                count++;
            }
        }
        return count;
    }
}
