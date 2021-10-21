package Practice;

import java.util.HashMap;

public class wordcount {
    public static void main(String[] args) {

        String str = "Hello, This is my WorkStation";
        int count =0;

        for (int i = 0; i<str.length(); i++) {

            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')){
                count++;
            }
        }
        System.out.println(count);
    }
}
