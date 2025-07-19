package StringQue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FindStartwithS {
    public static void main(String args[]){
        List<String> s2 = Arrays.asList("Saif","Zaid","Salim","Kiaf","Ahil","Amar","Sai");
        List<String> s3 = s2.stream().filter(x-> x.startsWith("S")).collect(Collectors.toList());
         System.out.println(s3);
;    }
}
