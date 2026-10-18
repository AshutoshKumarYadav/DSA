package JPMorgan.Strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    void main(String[] args){
        String str = "programing";
        System.out.println("Remove dublicate : "+removeDublicate(str));
    }

    public static String removeDublicate(String str){
        Set<Character> seen = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(seen.add(ch)){
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }
}
