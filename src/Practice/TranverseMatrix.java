package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class TranverseMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows");
        int rows = sc.nextInt();

        System.out.println("Enter the Col");
        int column = sc.nextInt();

        int matrix[][] = new int[rows][column];
        int transvcerse[][] = new int[column][rows];

        System.out.println("Enter the data of the Matrix");
        for (int i=0; i<rows; i++){
            for (int j=0; j<column; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Print the Input matrix");

        for (int i=0; i<rows; i++){
            for (int j=0; j<column; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i=0; i<rows; i++){
            for (int j=0; j<column; j++){
                transvcerse[j][i] = matrix[i][j];
            }
        }

        System.out.println("Print the Transpose Matrix");
        for (int[] r : transvcerse){
            System.out.println(Arrays.toString(r));
        }
    }
}
