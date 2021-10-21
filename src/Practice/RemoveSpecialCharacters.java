package Practice;

public class RemoveSpecialCharacters {

    public static void main(String[] args) {

        String str = "Today text  is : Today \n , \n , \n High \n 22 \n Low \n 14 \n , \n Light rain and a gentle breeze";

        System.out.println(str);

        str = str.replaceAll("\\W", "");
        System.out.println("------------");
        System.out.println(str);

        }

}
