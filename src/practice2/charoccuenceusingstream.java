package practice2;

public class charoccuenceusingstream {
    public static void main(String[] args) {

        String str = "Testing Solutions";

        long count = str.chars().filter(e -> (char) e == 'e' || (char) e == 's').count();
        System.out.println(count);
    }
}
