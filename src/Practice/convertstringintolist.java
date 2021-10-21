package Practice;

import java.util.*;

public class convertstringintolist {

    public static void main(String[] args) {
        convertStringIntoList("Geek");
        convertStringIntoList("Hello World");

    }

    public static void convertStringIntoList(String str){

            char[] charArray = str.toCharArray();

            List<Character> listchar = new ArrayList<>();
                for (Character ch : charArray){
                    listchar.add(ch);
                }
            System.out.println(listchar);
    }
}
