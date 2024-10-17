package JavaBasics.ImportantInterviewQuestions;

import java.io.File;
import java.util.Arrays;

public class FileHandleSortingOfFiles {

    public static void main(String[] args) {

        File file = new File("C:/Users/Saurabh_Dubey/Downloads");

        File downloadDir[] = file.listFiles();

        Arrays.sort(downloadDir);

        for (File e : downloadDir) {
            if (e.isFile()) {
                System.out.println("File is:" + e.getName());
            } else if (e.isDirectory()) {
                System.out.println("Directory is: " + e.getName());
            }
        }

    }
}
