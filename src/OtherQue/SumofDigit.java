package OtherQue;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumofDigit {

    public static void main(String args[]){
        int input = 12345;
        //Method Referecne
        int sum = String.valueOf(input).chars().map(Character::getNumericValue).sum();
        System.out.println(sum);
        //Without Method refrecne Lambda Exp
         int sum1 =  String.valueOf(input).chars().map((c) -> Character.getNumericValue(c)).sum();
         System.out.println(sum1);

    }
}
