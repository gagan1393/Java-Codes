package Practice;

public class RemovetheSpace {

    public static void main(String[] args) {
        removeSpaceBetweenTheString("My Name is Hello World");
        removeSpaceBetweenTheString("My Name is HelloWorld 12345");
        removeSpaceBetweenTheString("My    Name is Hello World");
        removeSpaceBetweenTheString("My Name         is Hello         World");
    }

    public static String removeSpaceBetweenTheString(String str){

        String name = str.replaceAll("\\s", "");
        System.out.println(name);
        return name;
    }
}
