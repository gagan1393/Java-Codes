package Streams;

import java.util.Arrays;
import java.util.List;

public class AverageOfAllNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 25, 30);
        double average = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(average);
    }
}
