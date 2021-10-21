package Practice;

public class PrimeNumber {

    public static void main(String[] args) {
        isPrimeNumber(7);
    }

    public static int isPrimeNumber(int numb){
        boolean flag = false;
        for (int i=2; i<= numb / 2; i++) {
            if (numb % i == 0){
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(numb + " Number is a Prime number");
        }
        else {
            System.out.println(numb + " Number is not a Prime number");
        }
        return numb;
    }
}
