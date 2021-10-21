package Practice;

public class printzerotohundred {

    public static void main(String[] args) {

        int one = 'A'/'A';
        String num = "..........";

        for (int i=one; i<=(num.length() * num.length()); i++){
            System.out.println(i);
        }

        System.out.println("-------------------------------------------------------");

        for (int i=one; i<='d'; i+=one){
            System.out.println(i);
        }
    }
}
