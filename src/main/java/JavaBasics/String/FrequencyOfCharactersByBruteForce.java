package JavaBasics.String;

public class FrequencyOfCharactersByBruteForce {
    public static void main(String[] args) {

        String str = "Old town road is best song i have ever listened to";

        int freq[] = new int[str.length()];

        char string[] = str.toCharArray();

        for (int i = 0; i < string.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j]) {
                    freq[i]++;
                    string[j] = '0';
                }
            }

        }
        System.out.println("Characters and their corresponding frequencies");
        for (int i = 0; i < freq.length; i++) {
            if (string[i] != ' ' && string[i] != '0') {
                System.out.println(string[i] + " : " + freq[i]);


            }
        }
    }
}