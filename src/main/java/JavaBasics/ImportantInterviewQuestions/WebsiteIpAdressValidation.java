package JavaBasics.ImportantInterviewQuestions;

import java.net.MalformedURLException;
import java.net.URL;

public class WebsiteIpAdressValidation {

    public static void main(String[] args) throws MalformedURLException {

        System.out.println(new URL("https://www.amazon.com").equals(new URL("https://162.219.225.118")));

    }
}
