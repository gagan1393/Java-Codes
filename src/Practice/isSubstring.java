package Practice;

public class isSubstring {

    public static void main(String[] args) {
        System.out.println(issubstring("My name is Joey", "Joey"));
        System.out.println(issubstring("My name is Joey", "Joey1"));
        System.out.println(issubstring("My name is Joey", "Jo"));
        System.out.println(issubstring("My name is Joey", "NAME"));

    }

    public static boolean issubstring(String main, String sub){

        return main.matches("(.*)" + sub + "(.*)");
    }


}
