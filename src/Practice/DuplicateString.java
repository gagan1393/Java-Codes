package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateString {
    public static void main(String[] args) {
        DuplicateStringPresent("Java");
        DuplicateStringPresent(null);
        DuplicateStringPresent("J");
        DuplicateStringPresent("Helloo");
        DuplicateStringPresent("");
        DuplicateStringPresent("007");


    }

    public static void DuplicateStringPresent(String str){

        if (str == null){
            System.out.println("The string is NULL");
            return;
        }

        if (str.isEmpty()){
            System.out.println("The string is Empty");
            return;
        }

        if (str.length() ==1){
            System.out.println("The String contains Single character");
            return;
        }

        char word[] = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        for (Character ch : word){
            if (charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch) + 1);

            }else {
                charMap.put(ch, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet){
            if (entry.getValue() > 1){
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }


    }
}
