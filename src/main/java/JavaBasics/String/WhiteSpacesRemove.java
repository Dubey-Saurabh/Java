package JavaBasics.String;

public class WhiteSpacesRemove {
    public static void main(String[] args) {
        String str = "Live your impossible";

        //Immutable concept of string
        str.concat(" "+ "yeah it is");
        System.out.println(str);
        System.out.println(str.concat("yeah it is"));


        str = str.replaceAll("\\s+", "");
        System.out.println(str);
    }

}
