package Practice;

import java.util.HashMap;
import java.util.Map;

public class charoccurenceofstring {

    public static void main(String[] args) {

        charOccurence("Testing");
        charOccurence("Testing Testing");
    }

    public static void charOccurence(String str){

        Map<Character, Integer> charoccur = new HashMap<Character, Integer>();

        char[] chs = str.toCharArray();

        for (Character ch : chs){

            if (charoccur.containsKey(ch)) {
                charoccur.put(ch, charoccur.get(ch) + 1);
            }else {
                charoccur.put(ch, 1);
            }
        }
        System.out.println(str + " : " + charoccur);
    }
}
