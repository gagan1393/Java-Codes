package practice2;

public class Hello {
    public static void main(String[] args) {
        Hello h = new Hello();
        h.show("siri");
    }

    public void show(Object obj){
        Hello h = (Hello) obj;
        System.out.println(h.toString());
    }
    public String toString(){
        return "Hello";
    }
}
