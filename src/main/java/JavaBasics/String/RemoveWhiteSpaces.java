package JavaBasics.String;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = "What an awesome wheather is";

		// To remove white spaces we use regex method in string

		String str1 = str.replaceAll("\\s+", "");

		System.out.println(str1);

	}

}
