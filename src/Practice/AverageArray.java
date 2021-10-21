package Practice;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageArray {

    public static void main(String[] args) {

        int num[] = {1,2,3,4,5,6,7,8,9};

        int total = 0;

        for(int e : num){
            total = total + e;
        }
        System.out.println("The total number is "+ total); //45
        System.out.println("The average number is " + total/num.length); //5

        //Java8

        OptionalDouble average = Arrays.stream(num).average();
        System.out.println("The average number is " + average);
    }

}
