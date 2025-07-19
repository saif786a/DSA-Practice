package StringQue;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

    public static void main(String args[]){
        String s1 = "I a Saif Alam";
        String[] word = s1.split(" ");
        StringBuffer rev = new StringBuffer();

        for(int i = word.length - 1 ; i >= 0;i--){
            rev.append(word[i]);

            if(i != 0){
                rev.append(" ");
            }

        }
        System.out.println(rev.toString());
//        String[] words = s1.split("\\s+");
//
//        String reversed = IntStream.range(0, words.length)
//                .mapToObj(i -> words[words.length - 1 - i]) // reverse order
//                .collect(Collectors.joining(" ")); // join with space
//        System.out.println("Reversed: " + reversed);
    }
}
