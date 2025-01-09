package practice2;

public class reverseastring {
    public static void main(String[] args) {
        ReverseAString("This34#is@&special");
    }

    private static void ReverseAString(String str) {

        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

    }
}
