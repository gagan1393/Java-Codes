package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,0);

        //Even numbers
        List<Integer> evenList = list.stream().filter(e -> e%2==0).collect(Collectors.toList());
        System.out.println(evenList);

        //odd Numbers
        List<Integer> oddList = list.stream().filter(e -> e%2!=0).collect(Collectors.toList());
        System.out.println(oddList);
    }
}
