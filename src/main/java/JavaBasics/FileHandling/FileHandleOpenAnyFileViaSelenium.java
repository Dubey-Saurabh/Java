package JavaBasics.FileHandling;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FileHandleOpenAnyFileViaSelenium {

    public static void main(String[] args) throws IOException {

        String path = "C:/Users/Saurabh_Dubey/Downloads/sample.txt";

        File file = new File(path);

        if (!Desktop.isDesktopSupported()) {
            System.out.println("Not supported desktop");
            return;
        }

        Desktop desktop = Desktop.getDesktop();

        if (file.exists()) {
            desktop.open(file);
        }


    }
}
