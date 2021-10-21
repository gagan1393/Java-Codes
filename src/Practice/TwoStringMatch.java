package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class TwoStringMatch {

    public static void main(String[] args) {

        System.out.println(isAnagram("CAT", "ACT"));
        System.out.println(isAnagram("CAT", "ACT "));
        System.out.println(isAnagram("CAT", "ACTTT"));
        System.out.println(isAnagram("CAT", "act"));
    }

    public static boolean isAnagram(String str1, String str2) {

        String str3 = str1.replaceAll("\\s", "");
        String str4 = str2.replaceAll("\\s", "");

        if (str3.length() != str4.length()) {
            return false;
        } else {
            char[] c1 = str3.toLowerCase().toCharArray();
            char[] c2 = str4.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            return Arrays.equals(c1, c2);
        }
    }
}
