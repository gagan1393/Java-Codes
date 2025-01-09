package practice2;

import java.util.*;
import java.util.stream.Collectors;

public class DupliucateNumberJava {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,3,3,5,10,25,10,25);

        Set<Integer> duplicate = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());

        System.out.println(duplicate);

    }
}
