package Practice;

public class VowelsCount {
    public static void main(String[] args) {
        System.out.println(isvowel("U"));

    }

    public static boolean isvowel(String t) {

        return t == "a" || t == "A" ||
                t == "e" || t == "E" ||
                t == "i" || t == "I" ||
                t == "o" || t == "O" ||
                t == "u" || t == "U" ;

    }
}
