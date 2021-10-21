package Practice;

import java.util.Arrays;

public class ShiftZeroFromLeftToright {


    public static int[] ShiftZeroToRight(int[] a){

        if(a.length ==1){
            return a;
        }

        int newArray[] = new int[a.length];
        int count =0;

        for (int number : a){
            if(number != 0){
                newArray[count] = number;
                count++;
            }
        }
        return newArray;
    }



    public static void main(String[] args) {
        //Test cases

        int[] i = new int[] {1, 0, 2, 3, 0, 5};
        System.out.println(Arrays.toString(ShiftZeroToRight(i)));

        i = new int[] {1, 2, 0, 0, 7, 9};
        System.out.println(Arrays.toString(ShiftZeroToRight(i)));

        i = new int[] {0, 0, 7, 2, 6, 8};
        System.out.println(Arrays.toString(ShiftZeroToRight(i)));

    }
}
