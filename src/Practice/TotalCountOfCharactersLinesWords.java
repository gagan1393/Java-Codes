package Practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TotalCountOfCharactersLinesWords {

    public static void main(String[] args) {

        String file = System.getProperty("user.dir") + "\\demo.txt";

        int countlines = 0;
        int wordlines = 0;
        int charCount = 0;

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String currentline = reader.readLine();

            while (currentline!=null){

                countlines++;

                //words
                String words[] = currentline.split(" ");
                wordlines = wordlines + words.length;

                //Lines
                for (String word : words){
                    charCount = charCount + words.length;
                }
                currentline = reader.readLine();
            }
            System.out.println("total lines :" + countlines);
            System.out.println("total words :" + wordlines);
            System.out.println("total charcount :" + charCount);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
