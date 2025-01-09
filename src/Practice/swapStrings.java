package Practice;

public class swapStrings {
    public static void main(String[] args) {

        String strr = "Hello  world red and blue";
        String str = strr.replaceAll(" ", "");
//        String str1 = "Red", str2 = "blue";
//
//        System.out.println("Strings before swapping:" + str1 + ":" + str2);
//        str1 = str1 + str2;
//        str2 = str1.substring(0, (str1.length() - str2.length()));
//        str1 = str1.substring(str2.length());
//        System.out.println("Strings After swapping:" + str1 + ":" + str2);

         char[] c = str.toCharArray();
        char c1 = c[5];
        c[5] = c[1];
        c[1] = c1;
        String swappedstring = new String(c);
        System.out.println(str);
        System.out.println(swappedstring);


    }}
