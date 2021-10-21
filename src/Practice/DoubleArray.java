package Practice;

public class DoubleArray {

    //output
    int object[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };

    /*
    //Output
    {1.4.7},
    {2,5,8},
    {3,6,9}
     */

    public static void main(String[] args) {

        int object[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i=0; i < object.length; i++){
            for (int j=0; j < object[i].length; j++){
                System.out.print(object[j][i]);
            }
            System.out.println();
        }


    }


}
