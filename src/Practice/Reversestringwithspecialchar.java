package Practice;

public class Reversestringwithspecialchar {

    public static void main(String[] args) {
        ReverseAString("This34#is@&special");
    }

    public static void ReverseAString(String str){

        int len = str.length();
        String rev = "";

        for(int i=len-1; i>=0; i--) {
                rev = rev + str.charAt(i);
            }

        System.out.println(rev);
    }
}
