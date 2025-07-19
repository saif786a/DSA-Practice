package StringQue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDupString {

    public static void main(String args[]){
        String str = "Programmingg";
        String remove = Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
        System.out.println(remove);
    }



}
