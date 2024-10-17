package JavaBasics.ImportantInterviewQuestions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineWordsCharacterCountsInAFile {

    public static void main(String[] args) throws IOException {

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        String path = "C:/Users/Saurabh_Dubey/Downloads/sample.txt";

        BufferedReader currentLine = new BufferedReader(new FileReader(path));
        String curLine = currentLine.readLine();

        while (curLine != null) {
            lineCount++;

            //For words
            String words[] = curLine.split(" ");
            wordCount = wordCount + words.length;

            //for Char
            for (String word: words){
                charCount = charCount + word.length();
        }
            curLine = currentLine.readLine();

    }
        System.out.println("Line Count: " +lineCount);
        System.out.println("Words count: "+wordCount);
        System.out.println("Characters count: " + charCount);

}


}
