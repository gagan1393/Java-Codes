package Practice;

public class RemoveTheSpaces {

    public static void main(String[] args) {

        String str = "        This is my Java code    bye ";
        String removespc = "";
        System.out.println(str);

        for (int i=0; i<str.length(); i++){
            if ((str.charAt(i)!= ' ') && (str.charAt(i)!= '\t')){
               removespc = removespc + str.charAt(i);
            }
        }
        System.out.println(removespc);
    }
}
