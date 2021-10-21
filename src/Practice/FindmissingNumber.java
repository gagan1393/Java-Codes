package Practice;

public class FindmissingNumber {

    public static void main(String[] args) {
        int num[] = {1,2,3,4,5, 7,8,9};
        int n1 = missingnumber(num, 9);
        System.out.println(n1);  //6
    }

    public static int missingnumber(int num[], int totalcount){
        int expsum = totalcount + ((totalcount+1)/2);
        int actualsum = 0;

        for(int i : num){
            actualsum +=1;
        }
        return expsum-actualsum;
    }
}
