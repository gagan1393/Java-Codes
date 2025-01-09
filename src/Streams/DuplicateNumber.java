package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumber {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,3,3,5,10,25,10,25);

        //First method
       // Set<Integer> duplicatenum = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
        //System.out.println(duplicatenum);

        //2nd method
        Set<Integer> duplicatenum = new HashSet<Integer>();
        Set<Integer> dupNum = list.stream().filter(e -> !duplicatenum.add(e)).collect(Collectors.toSet());
        System.out.println(dupNum);
    }
}
