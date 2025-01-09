package practice2;

import java.util.HashMap;
import java.util.Set;

public class occurenceofInteger {
    public static void main(String[] args) {
        numberOfDigits(56164l);
        numberOfDigits(5);

    }

    private static void numberOfDigits(long num) {

        HashMap<Long, Integer> hm = new HashMap<Long, Integer>();

        if (String.valueOf(num).length()==1){
            System.out.println(num);
            return;
        }

        while (num!=0) {
            long lastdigit = num % 10;
            if (hm.containsKey(lastdigit)) {
                hm.put(lastdigit, hm.get(lastdigit) + 1);
            } else {
                hm.put(lastdigit, 1);
            }
            num = num / 10;
        }
        Set<Long> keys = hm.keySet();
        for(Long key : keys){
            System.out.println(key + "---"+hm.get(key));
        }
    }
    }
