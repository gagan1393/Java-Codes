package practice2;

import java.util.HashMap;
import java.util.Map;

public class charoccurencestring {
    public static void main(String[] args) {
        charOccurence("Testing");
        charOccurence("Testing Testing");
        charOccurence("J");
    }

    private static void charOccurence(String str) {

        if(str.length() == 1){
            return;
        }

        Map<Character, Integer> hm = new HashMap<>();
        char[] chs = str.toCharArray();
       for (Character ch : chs){
           if(hm.containsKey(ch)){
               hm.put(ch, hm.get(ch) +1);
           }else {
               hm.put(ch, 1);
           }

       }
        System.out.println(str + "----" + hm);

    }
}
