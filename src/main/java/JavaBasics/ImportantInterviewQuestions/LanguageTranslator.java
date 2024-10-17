package JavaBasics.ImportantInterviewQuestions;

import java.lang.reflect.Field;

public class LanguageTranslator {

    static {
        try {
            Field value = String.class.getDeclaredField("value");
            value.setAccessible(true);
            value.set("Good Morning", value.get("Buen día"));
            value.set("My name is Saurabh", value.get("Mi nombre es saurabh"));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Good Morning");
        System.out.println("My name is Saurabh");
    }

}
