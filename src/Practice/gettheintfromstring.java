package Practice;

public class gettheintfromstring {

    public static void main(String[] args) {
        //o/p = P-10000543/00

        String s = "Your Policy Number is P-10000543/00 created successfully";


        String[] str = s.split("is");
        for (String ele : str){
            System.out.println(ele);
        }


    }
}
