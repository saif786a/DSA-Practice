package ArraysQue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {

    public static void main(String args[]){
        List<Integer> list = Arrays.asList(2,9,5,7,4,5,3,9);
        //REmove Duplicate
    //  List<Integer> s1 = list.stream().distinct().collect(Collectors.toList());
    //   System.out.println(s1);

        // Find Duplicate
        Set<Integer> seen = new HashSet<>();

        List<Integer> duplicates = list.stream()
                .filter(n -> !seen.add(n)) // if add() returns false, it's a duplicate
                .distinct()               // avoid repeated duplicates
                .collect(Collectors.toList());
        System.out.println(duplicates);

    }
}
