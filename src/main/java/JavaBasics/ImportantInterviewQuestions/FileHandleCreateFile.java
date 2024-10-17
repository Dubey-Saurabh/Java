package JavaBasics.ImportantInterviewQuestions;

import java.io.File;

public class FileHandleCreateFile {

    public static void main(String[] args) {

        File file = new File("C:/Users/Saurabh_Dubey/Downloads/sample.txt");
        try {
            boolean flag = file.createNewFile();
            if (flag){
                System.out.println("file is created");
            }else{
                System.out.println("File is already created");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
