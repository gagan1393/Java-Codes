package Practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class testpractice {

    public static void main(String[] args) {
//        reversestring("hello word");
    occurenceofstring("indiawin");
    }


 /*   public static void reversestring(String str){
        String[] split = str.split(" ");
        String revword = "";
        String rev = "";
        for(int i=0; i< split.length; i++){
            String word = split[i];
         for(int j=str.length()-1; j>0; j--){
            rev =  rev + str.charAt(j);
         }
         revword = revword + rev + " ";
        }
        System.out.println(revword);
    }*/

    public static void occurenceofstring(String str){
        Map<Character, Integer> hm = new HashMap<>();
        char[] chars = str.toCharArray();
        for (Character ch : chars){
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            }else {
                hm.put(ch, 1);
            }

        }
        System.out.println("The occurence of string is " + str + " " + hm.toString());
    }
}
