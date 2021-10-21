package Practice;

public class ReverseAString {
    public static void main(String[] args) {

        String str = "Hello World";

        StringBuilder sb = new StringBuilder(str.length());
        sb.append(str);

        sb.reverse();
        System.out.println(sb);
    }
}
