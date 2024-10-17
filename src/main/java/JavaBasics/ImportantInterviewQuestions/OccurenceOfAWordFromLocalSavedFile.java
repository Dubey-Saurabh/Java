package JavaBasics.ImportantInterviewQuestions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OccurenceOfAWordFromLocalSavedFile {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = null;

        String path = "C:/Users/Saurabh_Dubey/Downloads/sample.txt";

        Map<String, Integer> charMap = new HashMap<>();

        bufferedReader = new BufferedReader(new FileReader(path));

        String currentLine = bufferedReader.readLine();

        while (currentLine != null) {
            String words[] = currentLine.toLowerCase().split(" ");

            for (String word : words) {
                if (charMap.containsKey(word)) {
                    charMap.put(word, charMap.get(word) + 1);
                } else {
                    charMap.put(word, 1);
                }
            }

            currentLine = bufferedReader.readLine();
        }

        charMap.forEach((k, v) -> System.out.println(k + ":" + v));

        //Which word has occured maximum times

        Map<String, Integer>mapMap = new HashMap<>();

        charMap.entrySet().stream().filter(entry->entry.getValue() == Collections.max(charMap.values()))
                .forEach(e->mapMap.put(e.getKey(), e.getValue()));

        System.out.println(mapMap);


    }


}
