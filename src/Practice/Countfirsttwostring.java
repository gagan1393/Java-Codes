package Practice;

public class Countfirsttwostring {

    public static void main(String[] args) {

        countFirstTwoLetter("HelloWorld");
        countFirstTwoLetter("H");
        countFirstTwoLetter("H&*^%");
        countFirstTwoLetter(" KJK");
    }

    public static String countFirstTwoLetter(String str){

        if (str.length() >= 2){
            System.out.println(str.substring(0,2));
            return str;
        }else {
            System.out.println(str);
            return str;
        }


    }
}
