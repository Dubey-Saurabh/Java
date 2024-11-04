package JavaBasics.Practice;

public class NextLine {
    public static void main(String[] args) {

        System.out.println("Saurabh \nDubey");
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));

        System.out.println("perimeter: " + 2 * 3.14 * 7.5);
        System.out.println("average: " + (1 + 2 + 3) / 3);
        System.out.println("perimeterRect: " + (5.5 + 8.5) * 2);

        int a = 10;
        int b = 20;

        a = a + b; //30
        b = a - b; //10
        a = a - b; //a-b
        System.out.println(a + " and " + +b);
        System.out.println(System.getProperty("java.version"));

        int n = 136772;
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }

        System.out.println("sum: " + sum);

        String str = "The quick brown fox";
        String newString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            newString = newString + str.charAt(i);
        }

        System.out.println(newString);

        String str1 = "  Aa kiu, I swd skieo 236587. GH kiu: sieo??";

        int letters = 0;
        int spaces = 0;
        int Digit = 0;
        int other = 0;

        char ch[] = str1.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letters++;
            }
            if (Character.isSpaceChar(ch[i])) {
                spaces++;
            } else if (Character.isDigit(ch[i])) {
                Digit++;
            } else {
                other++;
            }
        }

        System.out.println(letters);
        System.out.println(spaces);
        System.out.println(Digit);
        System.out.println(other);
        //Current time and date
        System.out.format("\n Current date time: %tc%n\n", System.currentTimeMillis());

    }


}
