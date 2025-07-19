package StringQue;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondHigestOccurace {
    public static void main(String args[]){
        String s1 = "aaaabbbccddddd";
        String secondHigest = Arrays.stream(s1.split("")).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                //Group the elements in the Stream by themselves, and count how many times each one appears.
                .entrySet().stream().sorted((a,b) -> b.getValue().compareTo(a.getValue()))
                .skip(1).map(Map.Entry::getKey).findFirst().orElse(null);

        System.out.println(secondHigest);


    }
}
