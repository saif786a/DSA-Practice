package StringQue;

import java.util.Arrays;

public class FindLongestString {

    public static void main(String args[]) {
        String input = "Java is a Popular Programming Languageryur";
        String s1 = Arrays.stream(input.split(" "))
                // Reduce() Compare the two Element find their length keep longer one
                .reduce((word1, word2) -> word1.length() >= word2.length() ? word1 : word2).get();
        System.out.println(s1);

    }
}
