package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    void main(String[] args){
        List<List<String>>  input = Arrays.asList(
                Arrays.asList("nat", "tan"),
                Arrays.asList("tea", "eat", "ate"),
                Arrays.asList("bat")
        );
        System.out.println(input);

        List<List<String>> output=input.stream().flatMap(List::stream).collect(
                Collectors.groupingBy(
                word -> {
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                },
                        LinkedHashMap::new
                        ,
                        Collectors.toList()

                        )).values().stream().sorted(Comparator.comparingInt(List::size))
                .map(group->group.stream().sorted().collect(Collectors.toList()))
                .collect(Collectors.toList());



        System.out.println(output);







        List<List<String>> output1= input.stream().flatMap(List::stream).collect(
                Collectors.groupingBy(
                        words->{
                            char[] chars = words.toCharArray();
                            Arrays.sort(chars);
                            return new String(chars);
                        },
                        LinkedHashMap::new,
                        Collectors.toList()

                )).values().stream().sorted(Comparator.comparingInt(List::size))
                .map(group-> group.stream().sorted().collect(Collectors.toList()))
                .collect(Collectors.toList());









    }

}
