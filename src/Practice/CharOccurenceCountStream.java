public class CharOccurenceCountStream {

    public static void main(String[] args) {

        String str = "Testing Solutions";
        long count = str
                        .chars()
                                .filter(e -> (char) e == 's' || (char) e == 'i')
                                    .count();
        System.out.println(count);
    }
}
