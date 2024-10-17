package JavaBasics.ImportantInterviewQuestions;

import java.io.IOException;

public class LaunchDesktopApplicationsViaJava {

    public static void main(String[] args) throws IOException, InterruptedException {

        Runtime runtime = Runtime.getRuntime();
//        Process pr = runtime.exec("notepad.exe");
//        Thread.sleep(4000);
//        pr.destroy();
//
//        runtime.exec("notepad.exe C:\\Users\\Saurabh_Dubey\\Downloads\\sample.txt");  // If you want to open any specific file
//        pr.destroy();

//        String s[] =  new String[]{"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://www.instagram.com"};
//        runtime.exec(s);

        String p[] = new String[]{"C:\\Program Files\\Windows Media Player\\wmplayer.exe","C:\\Users\\Saurabh_Dubey\\Videos\\Screen Recordings\\sr.mp4"};
        runtime.exec(p);







    }

}
