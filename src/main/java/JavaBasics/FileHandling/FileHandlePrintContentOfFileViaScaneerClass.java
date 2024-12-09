package JavaBasics.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandlePrintContentOfFileViaScaneerClass {

    public static void main(String[] args) throws FileNotFoundException {


        String path = "C:/Users/Saurabh_Dubey/Downloads/sample.txt";

        File file = new File(path);
        Scanner sc = new Scanner(file);

        System.out.println("Content of file is: ");
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

    }
}
