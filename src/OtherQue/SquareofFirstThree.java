package OtherQue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareofFirstThree {

    public static void main(String args[]){
        List<Integer> list = Arrays.asList(2,5,3,6,8,9,4);
        List<Integer> list2 = list.stream().filter(x -> x % 2 == 0).limit(3)
                .map((n) -> n*n)
                .collect(Collectors.toList());
        System.out.println(list2);


    }
}
