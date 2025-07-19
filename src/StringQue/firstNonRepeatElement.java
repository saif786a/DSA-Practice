package StringQue;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class firstNonRepeatElement {

    public static void main(String arg[]){
       String s1 = "ilovejavaprogram";

        String d1 = Arrays.stream(s1.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(x-> x.getValue() == 1).findFirst().get().getKey();
                System.out.println(d1);

    }
}
