package OtherQue;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class MaxAndMin {

    public static void main(String args[]){
        List<Integer> list = Arrays.asList(12,34,56,3,6,88,99,43);
        // Using Method Refrecne
        Integer maxValue = list.stream().max(Integer::compareTo).get();
        System.out.println(maxValue);

//

       //Using Lambda Exp
        Integer minValue = list.stream().min((i1,i2)-> i1.compareTo(i2)).get();
        System.out.println(minValue);

    }
}
