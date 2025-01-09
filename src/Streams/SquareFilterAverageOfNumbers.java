package Streams;

import java.util.Arrays;
import java.util.List;

public class SquareFilterAverageOfNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 10, 20, 30, 15);
        double avg = list.stream().map(e -> e*e)
                    .filter(e -> e>100)
                    .filter(e -> e>=900)
                    .mapToInt(e -> e)
                    .average().getAsDouble();

        System.out.println(avg);
    }
}
