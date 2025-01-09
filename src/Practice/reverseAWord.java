package Practice;

public class reverseAWord {

    public static void main(String[] args) {
        reverseWord("My Name is Nishant");
    }

    public static void reverseWord(String str){

//        String[] words = str.split(" ");
//        String revword = "";
//
//        for(int i=0; i< words.length; i++){
//            String word = words[i];
//            int len = str.length();
//            String rev = "";
//            for(int j=len-1; j>=0; j--){
//                rev = rev + str.charAt(j);
//           }
//            revword = revword + rev + " ";
//        }
//        System.out.println(revword);
//    }
        String[] word = str.split(" ");
        String revWord = "";
        String rev = "";
         for (int i=0; i< word.length; i++) {
             String wrd = word[i];
             int len = str.length();
             for (int j = len - 1; j >= 0; j--) {
                 rev = rev + str.charAt(j);
             }
            revWord =  revWord + rev + " ";
         }
             System.out.println(revWord);
         }
    }

