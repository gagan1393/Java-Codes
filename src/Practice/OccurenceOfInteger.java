package Practice;

import java.util.HashMap;
import java.util.Set;

public class OccurenceOfInteger {
    //numberOfDigits(123123123L);
    //numberOfDigits(12222L);
    //numberOfDigits(123333L);
    //numberOfDigits(1L);

    public static void main(String[] args) {
        numberOfDigits(56164l);
    }
    public static void numberOfDigits(Long number){
        if (String.valueOf(number).length()==1){
            System.out.println(number + " is single digit");
            return;
        }
        HashMap<Long, Integer> digitcount = new HashMap<Long, Integer>();
        while (number !=0){
            Long lastdigit = number%10;
            if (digitcount.containsKey(lastdigit)){
                digitcount.put(lastdigit, digitcount.get(lastdigit)+1);
            }else {
                digitcount.put(lastdigit, 1);
            }
            number = number/10;
        }
        Set<Long> keys = digitcount.keySet();
        for (Long key : keys){
            System.out.println(key + " : " + digitcount.get(key));
        }
    }
}
