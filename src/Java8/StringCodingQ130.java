package Java8;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//Reverse, palindrome, anagram, duplicate characters, first non-repeating character, frequency counting.
public class StringCodingQ130 {

    void main(String[] args){
        //Reverse a String
        String input = "Ashutosh";

        String result = new StringBuilder(input)
                .reverse()
                .toString();

        //System.out.println(result);
        //_____________________________________________

        //Q2. Check whether a String is palindrome
        String input1 = "madam";

        boolean result1 = input1.equals(
                new StringBuilder(input1).reverse().toString()
        );

        //System.out.println(result1);
//_____________________________________________________________________________//
        //Q3. Count character frequency using Streams
        String input2 = "banana";

        Map<Character, Long> result3 = input2.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        //System.out.println(result3);
//________________________________________________________________________________

        //Q4 - Find Duplicate Characters
        String input4 = "programming";

        Set<Character> seen = new HashSet<>();

        Set<Character> duplicates = input4.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !seen.add(c))
                .collect(Collectors.toCollection(LinkedHashSet::new));

        //System.out.println(duplicates);

//_________________________________________________________________________

        //Q5 - First Non-Repeating Character

        String input5 = "swiss";

        Character result5 = input5.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> input5.indexOf(c) == input5.lastIndexOf(c))
                .findFirst()
                .orElse(null);

        //System.out.println(result5);

 //_______________________________________________________________________________
    //Q6. Check Whether Two Strings Are Anagrams

        String s1 = "listen";
        String s2 = "silent";

        String a = s1.chars()
                .sorted()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();

        String b = s2.chars()
                .sorted()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();

        //System.out.println(a.equals(b));

//_______________________________________________________________

        //Q7. Count Vowels in a String

        String input7 = "Hello World";

        long count = input7.toLowerCase()
                .chars()
                .filter(c -> "aeiou".indexOf(c) >= 0)
                .count();

        //System.out.println(count);

//_______________________________________________________________________

    //Q8. Remove Duplicate Characters
        String input8 = "programming";

        String result8 = input8.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .distinct()
                .collect(Collectors.joining());

        //System.out.println(result8);

//_________________________________________________________________________
//Q9. Find the Longest Word
        String input9 = "Java is very powerful";

        String result9 = Arrays.stream(input9.trim().split("\\s+"))
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        //System.out.println(result9);
//________________________________________________________________________

        //Q10. Count Words in a Sentence

        String input10 = "Java 8 is powerful";

        long count10 = Arrays.stream(input10.trim().split("\\s+"))
                .filter(word -> !word.isEmpty())
                .count();

        //System.out.println(count10);

//___________________________________________________________________________
        //Q11. Reverse Each Word in a Sentence
        String input11 = "Java is good";

        String result11 = Arrays.stream(input11.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        //System.out.println(result11);

//_____________________________________________________________________________

        //Q12. Find the First Repeating Character

        String input12 = "programming";

        Map<Character, Long> frequency = input12.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        Character result12 = input12.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> frequency.get(c) > 1)
                .findFirst()
                .orElse(null);

        //System.out.println(result12);
//----------------------------------------------------------------

        //Q13. Check Whether a String Contains Only Digits
        String input13 = "123456";

        boolean result13 = !input13.isEmpty()
                && input13.chars().allMatch(Character::isDigit);

        //System.out.println(result13);

//_____________________________________________________________________

        //Q14. Find the Second Most Frequent Character
        String input14 = "aabbbccccdd";

        Map<Character, Long> frequency14 = input14.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        Character result14 = frequency14.entrySet().stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue()
                        .reversed())
                .skip(1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        //System.out.println(result14);

    //__________________________________________________________________

    //Q15. Check Whether Two Strings Are Rotations
        String s15 = "ABCD";
        String s25 = "CDAB";

        boolean result15 = s15.length() == s25.length()
                && (s15 + s15).contains(s25);

        //System.out.println(result15);
//__________________________________________________________________________

        //Q16. Remove All White Spaces
        String input16 = "Java 8 is great";

        String result16 = input16.replaceAll("\\s+", "");

        //System.out.println(result16);

//_____________________________________________________________________________

        //Q17. Count Uppercase and Lowercase Characters

        String input17 = "Java8Code";

        long upper = input17.chars()
                .filter(Character::isUpperCase)
                .count();

        long lower = input17.chars()
                .filter(Character::isLowerCase)
                .count();

        //System.out.println("Uppercase = " + upper);
        //System.out.println("Lowercase = " + lower);

//____________________________________________________________________________

       // Q18. Find All Permutations of a String
        permute("ABC", "");

      //Q19. Find the Longest Palindromic Word

        String input19 = "madam racecar level";

        String result19 = Arrays.stream(input19.split("\\s+"))
                .filter(word -> word.equals(
                        new StringBuilder(word).reverse().toString()))
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        //System.out.println(result19);

    //________________________________________________________________________

        //Q20. Find the Most Frequent Character

        String input20 = "success";

        Map<Character, Long> frequency20 = input20.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        Character result20 = frequency20.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        //System.out.println(result20);

        //Q21. String Compression


        String input21 = "aaabbccccd";
        StringBuilder result21 = new StringBuilder();

        int count21 = 1;

        for (int i = 1; i < input21.length(); i++) {
            if (input21.charAt(i) == input21.charAt(i - 1)) {
                count21++;
            } else {
                result21.append(input21.charAt(i - 1)).append(count21);
                count21 = 1;
            }
        }

        if (!input21.isEmpty()) {
            result21.append(input21.charAt(input.length() - 1))
                    .append(count21);
        }

        //System.out.println(result21);

        //Q22. Find the First Non-Repeating Character Using Java 8














    }
    static void permute(String str, String result) {
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String remaining =
                    str.substring(0, i) + str.substring(i + 1);

            permute(remaining, result + ch);
        }
    }


}
