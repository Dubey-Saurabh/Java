package JavaBasics.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileHandlePrintContentOfFileViaFileInputStream {

    public static void main(String[] args) throws IOException {

        String path = "C:/Users/Saurabh_Dubey/Downloads/sample.txt";

        File file = new File(path);

        FileInputStream fileInputStream = new FileInputStream(file);

        System.out.println("File content is: ");

        int counter = 0;

        while ((counter = fileInputStream.read()) != -1) {

            System.out.print((char) counter);

        }

    }
}
