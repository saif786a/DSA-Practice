package StringQue;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountofOccuranceChar {

   public static void main(String args[]){
       String s1 = "saifalamzaid";
          Map<String, Long> map = Arrays.stream(s1.split(""))
                  .collect(Collectors.groupingBy(s-> s,Collectors.counting()));
          //Group the elements in the Stream by themselves, and count how many times each one appears.
          System.out.println(map);
//     Map<Character,Long> count = s1.chars().mapToObj(c-> (char) c)
//             .collect(Collectors.groupingBy(c-> c
//                     ,Collectors.counting()));
//     System.out.println(count);
   }
}
