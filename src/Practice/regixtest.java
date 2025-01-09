package Practice;

public class regixtest{
    public static void main(String[] args) {
        String str = "This Is Me"; //This _Is _Me  //_This _Is _Me
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(i!=1 && Character.isUpperCase(c)){
                sb.append("_");
            }
            sb.append(c);
        }
        System.out.println(sb);
    }
}
