package Practice;

public class getLengthOfString {

    public static void main(String[] args) {
        System.out.println(getLength("testing"));  //7
    }

    public static int getLength(String str){

        int i = 0;

        try {

        while (true){
            str.charAt(i);
            i++;
        }
    }
        catch(IndexOutOfBoundsException e){
    return i;
        }
    }

}
