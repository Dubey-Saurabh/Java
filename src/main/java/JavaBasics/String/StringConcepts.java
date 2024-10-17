package JavaBasics.String;

import java.util.Arrays;

public class StringConcepts {

    public static void main(String[] args) {

        String str = "Live your impossible";

        System.out.println("_________________________" + "Immutable String concept");
        str.concat("yeah it is");
        System.out.println(str);
        System.out.println(str.concat("yeah it is"));

        System.out.println("_________________________" + "Convert into String");

        //Convert into String
        //valueOf
        int i = 100;
        String s = String.valueOf(i);
        System.out.println(i + 200);
        System.out.println(s + 200);

        //toString

        int j = 200;
        String s1 = Integer.toString(j);
        System.out.println(s1 + 100);

        //format

        int k = 300;
        String s2 = String.format("%d", i);
        System.out.println(s2 + 200);

        System.out.println("_________________________" + "Convert String into some other data type");
        //Convert String into some other data type

        //parseInt

        String s4 = "400";
        Integer l = Integer.parseInt(s4);
        System.out.println(l);

        //valueOf

        String s5 = "101";
        Integer m = Integer.valueOf(s5);
        System.out.println(m);


        System.out.println("_________________________" + "String comparison concept");

        //equals and equalsIgnoreCase already known, they are used to compare string content or values

        //== operator compare references not value or content

        String s6 = "Saurabh";
        String s7 = "Saurabh";
        String s8 = new String("Saurabh");

        System.out.println(s6 == s7); //true
        System.out.println(s7 == s8); //false

        //compareTo method
        String s9 = "Saurabh";
        String s10 = "Saurabh";
        String s11 = "Dubey";

        System.out.println(s9.compareTo(s10));
        System.out.println(s9.compareTo(s11));
        System.out.println(s11.compareTo(s10));


        System.out.println("_________________________" + "String contains method");

        //doesn't work in case sensitive, fot that we use equals method


        String t = "World is beautiful";
        String t1 = "Is";
        System.out.println(t.contains(t1));


        System.out.println("_________________________" + "String indexOf method");

        //To get the index of the word

        String u = "World is beautiful";
        String u1 = "is";
        System.out.println(u.indexOf(u1));

        System.out.println("_________________________" + "String endsWith method");

        //doesn't work in case sensitive , Same we have startsWith


        String u2 = "World is beautiful";
        System.out.println(u2.endsWith("l"));
        System.out.println(u2.endsWith("L"));
        System.out.println(u2.endsWith("beautiful"));
        System.out.println(u2.endsWith("Beautiful"));


        System.out.println("_________________________" + "get chars method");

        //public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)
//
//        String u3 = new String("hello javatpoint how r u");
//        char[] ch = new char[10];
//        try{
//            u3.getChars(6, 16, ch, 0);
//            System.out.println(ch);
//        }catch(Exception ex){System.out.println(ex);}
//    }}

        System.out.println("_________________________" + "String join method");

        //public static String join(CharSequence delimiter, CharSequence... elements)

        String joinString1 = String.join("-", "welcome", "to", "javatpoint");
        System.out.println(joinString1);

        String date = String.join("/", "25", "06", "2018");
        System.out.print(date);
        String time = String.join(":", "12", "10", "10");
        System.out.println(" " + time);

        System.out.println("_________________________" + "lastIndexOf method");


        //int lastIndexOf(int ch)
        String javaTpoint2 = "Friendship is above all";
        System.out.println(javaTpoint2.lastIndexOf("o"));

        //int lastIndexOf(int ch, int fromIndex)
        String javaTpoint3 = "Friendship is above all";
        System.out.println(javaTpoint3.lastIndexOf('o', 2));

        //int lastIndexOf(String substring)
        String javaTpoint4 = "This is last index of example";
        int index = javaTpoint4.lastIndexOf("of");
        System.out.println(index);

        //int lastIndexOf(String substring, int fromIndex)

        String javaTpoint5 = "This is last index of example";
        int index1 = javaTpoint5.lastIndexOf("of", 25);
        System.out.println(index1);
        index1 = javaTpoint5.lastIndexOf("of", 10);
        System.out.println(index1); // -1, if not found

        System.out.println("_________________________" + "String Split method");

        String a1 = "java string split method by javatpoint";

        String a2[] = a1.split("\\s"); // Splitting on the basis of white space

        System.out.println(Arrays.toString(a2)); // to print an array of String

        //Java String split() method with regex and length example 2

        String a3 = "Javatpointtt";
        System.out.println("Returning words:");
        String[] a4 = a3.split("t", 0);
        System.out.println(Arrays.toString(a4));


        System.out.println("_________________________" + "String's subString method");

        //startIndex: inclusive
        //endIndex: exclusive

        String a5 = "Javatpointtt";
        System.out.println(a5.substring(5));
        System.out.println(a5.substring(4, 8));


        String address = "255.100.50.0";
        System.out.println(address.replace(".", "[ . ]"));

        String c = "codeleet";
        System.out.println(c.substring(4) + c.substring(0,4) );







    }
}
