package StringQue;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AscandDsc {

      public static void main(String args[]){
          List<String> list = Arrays.asList("Banana","Cat,","Bat","Apple","Rat","Dog","Zebra");
         //ASC
          List<String> list1 = list.stream().sorted().collect(Collectors.toList());
          System.out.println(list1);

          //DSC
          List<String> list2 = list.stream().sorted(Comparator.reverseOrder())
                  .collect(Collectors.toList());
          System.out.println(list2);
      }
}
