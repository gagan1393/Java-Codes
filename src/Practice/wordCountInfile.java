package Practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class wordCountInfile {
    public static void main(String[] args) {

        String file = System.getProperty("user.dir") + "\\demo.txt";
        HashMap<String, Integer> wordmap = new HashMap<String, Integer>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            try {
                String currentline = reader.readLine();

                if(!currentline.isEmpty()) {
                    while (currentline != null) {
                        String words[] = currentline.toLowerCase().split(" ");
                        for (String word : words) {
                            if (wordmap.containsKey(word)) {
                                wordmap.put(word, wordmap.get(word) + 1);
                            } else {
                                wordmap.put(word, 1);
                            }
                        }
                        currentline = reader.readLine();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        wordmap.forEach((k, v) -> System.out.println(k + " = " + v));

        Map<String, Integer> maxMap = new HashMap<String, Integer>(); {

            wordmap.
                    entrySet().
                        stream().
                            filter(entry -> entry.getValue() == Collections.
                                        max(wordmap.values())).
                                            forEach(e -> maxMap.
                                                    put(e.getKey(), e.getValue()));
            System.out.println("----------------------");
            System.out.println(maxMap);
        }
    }
}
