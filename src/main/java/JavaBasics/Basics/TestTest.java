package JavaBasics.Basics;

import java.util.HashMap;
import java.util.HashSet;

public class TestTest {

    public static void main(String[] args) {
        String name = "Saurabh";
        String newName="";

        HashSet<Character> set = new HashSet<>();

        for(char ch : name.toCharArray()){

            if(!set.contains(ch)){
                set.add(ch);
            }
        }
        System.out.println(set);


    }
}
