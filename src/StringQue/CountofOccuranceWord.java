package StringQue;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountofOccuranceWord {

    public static void main(String args[]){
        String str = "Welcome to the World of Program to the world;";
        Map<String,Long> countt = Arrays.stream(str.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countt);
    }

}
