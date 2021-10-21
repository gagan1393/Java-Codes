package Practice;

import java.util.StringJoiner;

public class StringJoinerConcept {

    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(";", "{", "}");
        joiner.add("Hello")
                            .add("world")
                                        .add("bye")
                                                    .add("12345");

        System.out.println(joiner) ;             //{Hello;world;bye}
        System.out.println(joiner.toString());  //{Hello;world;bye}
    }
}
