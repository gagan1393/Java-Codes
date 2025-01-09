package HackrerRankSolutions;

import java.util.Scanner;

public class Calculator {



    public static void main(String[] args) {

        char operator;
        double num1;
        double num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Operator (+, -, *, /)");
        operator = sc.next().charAt(0);

        System.out.println("Enter The Two Numbers");

        num1  = sc.nextDouble();
        num2  = sc.nextDouble();

        switch (operator){
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1+num2));
                break;

            case '-':
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1-num2));
                break;

            case '*':
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1*num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1 / num2));
                }else {
                    System.out.println("Divide by zero Situation");
                }
                break;

            default:
                System.out.printf("%c Invalid Operator", operator);
        }

    }

}
