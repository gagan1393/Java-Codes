package practice2;

public class AverageArrayJava {

    public static void main(String[] args) {

        int num[] = {1,2,3,4,5,6,7,8,9};
         int total = 0;

         for (int e: num){
             total = total + e;
        }
        System.out.println("Average of this array is "+ total/num.length); //5
    }

}
