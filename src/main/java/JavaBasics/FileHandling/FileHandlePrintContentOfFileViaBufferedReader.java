package JavaBasics.FileHandling;

import java.io.*;

public class FileHandlePrintContentOfFileViaBufferedReader {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader;

        String path = "C:/Users/Saurabh_Dubey/Downloads/sample.txt";

        File file = new File(path);

        bufferedReader = new BufferedReader(new FileReader(file));

        System.out.println("File content is: ");

        int counter = 0;

        while ((counter = bufferedReader.read()) != -1) {

            System.out.print((char) counter);

        }


    }
}
