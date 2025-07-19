package ArraysQue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedAndReverse {

    public static void main(String args[]){
        //Sorted Order
     //  int[] arr = {33,2,4,78,54,11,56};
       List<Integer> arr = Arrays.asList(33,2,4,78,54,11,56,2);
       List<Integer> s1=  arr.stream().distinct() // // Box Convert int to Integer
               .sorted().collect(Collectors.toList());
       System.out.println(s1);

       //reverse Order
      List<Integer> arr1 =  arr.stream().distinct()
              .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(arr1);

        // Second Higest Element
        Integer ar2 =  arr.stream() //Covert list into Stream
                .distinct()  // Remove Duplicate Element
                .sorted(Comparator.reverseOrder()) // Reverse The Element
                .skip(1).findFirst().get();
        System.out.println(ar2);



    }
}
