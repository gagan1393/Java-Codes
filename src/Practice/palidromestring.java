package Practice;

public class palidromestring {
    public static void main(String[] args) {
        String str = "Radar";
        String rev = "";

        for (int i=str.length()-1; i >=0; i--){
           rev = rev + str.charAt(i);
        }

        if
        (str.toLowerCase().equals(rev.toLowerCase())){
                System.out.println(str + " string is palidrome");
            }else{
                System.out.println(str + " string is not palidrome");
            }

        }
    }

