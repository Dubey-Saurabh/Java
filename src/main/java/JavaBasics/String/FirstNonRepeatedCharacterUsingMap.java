package JavaBasics.String;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatedCharacterUsingMap {

	public static void main(String[] args) {

		System.out.println("please enter an input string");

		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();

		int len = str.length();

		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

		Character ch;

		for (int i = 0; i < len; i++) {

			ch = str.charAt(i);

			if (charMap.containsKey(ch)) {

				charMap.put(ch, charMap.get(ch) + 1);

			} else {

				charMap.put(ch, 1);

			}
		}

		for (int j = 0; j < len; j++) {

			ch = str.charAt(j);

			if (charMap.get(ch) == 1) {

				System.out.println("First non repeated character is : " + ch);
				break;
			}

		}
	}

}
