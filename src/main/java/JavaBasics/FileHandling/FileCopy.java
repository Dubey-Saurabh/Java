package JavaBasics.FileHandling;

import java.io.*;

public class FileCopy {

    public static void main(String arg[]) {
        copyFile();
    }

    public static void copyFile() {
        File file = new File("C:/Users/Saurabh_Dubey/Downloads/Personal DEIB Action Plan.pdf");
        File opFile = new File("C:/Users/Saurabh_Dubey/Downloads/PERSONAL DEIB Action Plan.pdf");

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(opFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(fileInputStream.available());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int i = 0;
        try {
            while((i = fileInputStream.read())!=-1) {
                fileOutputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            //close the streams:
            if(fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }





}
