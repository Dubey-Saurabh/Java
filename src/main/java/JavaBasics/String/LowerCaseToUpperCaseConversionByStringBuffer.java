package JavaBasics.String;

public class LowerCaseToUpperCaseConversionByStringBuffer {

	public static void main(String[] args) {
		String str = "Great Power";

		StringBuffer sb = new StringBuffer(str);

		for (int i = 0; i < str.length(); i++) {
			// check for lower case character
			if (Character.isLowerCase(str.charAt(i))) {
				// convert into upper case
				sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			} else if (Character.isUpperCase(str.charAt(i))) {
				// convert into upper case
				sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}

		}
		System.out.println("After conversion: " + sb);

	}

}
