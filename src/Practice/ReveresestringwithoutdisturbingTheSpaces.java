package Practice;

public class ReveresestringwithoutdisturbingTheSpaces {

    public static void main(String[] args) {
        getReverseString("I am Hello World");
    }

    public static void getReverseString(String str){

        String strArray[] = str.split(" ");

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == ' ') {
                sb.insert(i, ' ');
            }
        }
        sb.append("");
        System.out.println(sb);
    }
}
