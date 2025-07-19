package StringQue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class findDuplicateAndUnique {

    public static void main(String args[]){
        String s1 = "thisspgrogramaifh";
        //Find Dyplicate
         List<String> dup = Arrays.stream(s1.split(""))
                   .collect(Collectors.groupingBy(Function.identity() ,Collectors.counting()))
                   .entrySet().stream().filter(x-> x.getValue() > 1).map(Map.Entry::getKey)
                 .collect(Collectors.toList());
          System.out.println(dup);

        // Find Unique
        List<String> uniquee = Arrays.stream(s1.split(""))
                .collect(Collectors.groupingBy(c-> c,Collectors.counting()))
                .entrySet().stream().filter(x-> x.getValue() == 1).map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(uniquee);

    }
}
