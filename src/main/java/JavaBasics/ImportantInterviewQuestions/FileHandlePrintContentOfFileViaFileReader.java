package JavaBasics.ImportantInterviewQuestions;

import java.io.FileReader;
import java.io.IOException;

public class FileHandlePrintContentOfFileViaFileReader {

    public static void main(String[] args) throws IOException {

        String path = "C:/Users/Saurabh_Dubey/Downloads/sample.txt";

        FileReader fileReader = new FileReader(path);

        System.out.println("File content is: ");

        int counter = 0;

        while ((counter = fileReader.read()) != -1) {

            System.out.print((char) counter);

        }

    }
}
