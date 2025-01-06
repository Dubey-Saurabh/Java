package JavaBasics.String;

import java.lang.String;

public class RevStringWIthoutPositionChange {

	public static void main(String[] args) {

		char vale = ' ';
		String value1 = "";
		String finalString = "";
		String str = "I love India";
		String list[] = str.split(" ");

		for (int i = 0; i < list.length; i++) {
			value1 = "";

			for (int j = list[i].length() - 1; j >= 0; j--) {
				vale = list[i].charAt(j);
				value1 = value1 + vale;

			}
			finalString += value1 + " ";

		}
		System.out.println(finalString);

	}

}
