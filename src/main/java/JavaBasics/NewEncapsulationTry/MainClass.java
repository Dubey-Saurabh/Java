package JavaBasics.NewEncapsulationTry;

public class MainClass {

    public static void main(String[] args) {

        String string ="This is my interview of Tech Mahindra";
        char charArray[] = string.toCharArray();
        int vowels=0;

        for(char elements: charArray){
            if("aeiou".indexOf(elements) == -1){
                vowels++;
            }
        }

        System.out.println(vowels);


    }

}
