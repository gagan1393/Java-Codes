package Practice;

public class ReverseAStringUsingother {

    public static void main(String[] args) {

        ReverseAString("abcdefghijklmnopqrst");
        ReverseAString("HelloWorld");

    }
    public static void ReverseAString(String str){

        int len = str.length();
        String rev = "";
        for (int i = len - 1; i>=0; i-- ){
            if (i%2 ==0){
            rev = rev + str.charAt(i);
            }
        }
        System.out.println(rev);
    }
}
