package Streams;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AdditionOfNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 5, 25);
        Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);
        System.out.println("Sum of Numbers is " + sum.get());

    }
}
