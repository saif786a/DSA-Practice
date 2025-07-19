package StringQue;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReveserEachWords {

    public static void main(String args[]){
        String str = "My Name is Saif";
//        String s1 = "";
//
//        for(int i =  str.length()-1; i >= 0;i--){
//            s1 = s1+str.charAt(i);
//        }
//       System.out.println(s1);

        //Using Java 8
        String s2 = Arrays.stream(str.split(" "))
                .map((word) -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(s2);
    }
}
