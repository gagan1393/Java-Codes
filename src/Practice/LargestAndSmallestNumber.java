package Practice;

import java.util.Arrays;

public class LargestAndSmallestNumber {

    public static void main(String[] args) {

        int num[] = {10,20,30,-98, 56468, 999999, 0, 1245789, -100, -101};
        int largestnum = num[0];
        int smallestnum = num[0];

        for (int i=1; i<num.length; i++) {

            if (num[i] > largestnum) {
                largestnum = num[i];
            } else if (num[i] < smallestnum) {
                smallestnum = num[i];
            }
        }
        System.out.println("The Array is ::::" + Arrays.toString(num));
        System.out.println("The Largest Number is " + largestnum);
        System.out.println("The Smallest Number is " + smallestnum);
    }
}
