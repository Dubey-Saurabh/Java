package JavaBasics.String;
import java.lang.String;
public class LengthOfStringWithoutLengthMethod {

	public static void main(String[] args) {
		String str = "Testing";

		System.out.println(str.toCharArray().length);

		System.out.println(str.lastIndexOf(""));

		System.out.println(str.split("").length);

		int count = 0;
		for (char c : str.toCharArray()) {
			count++;
		}
		System.out.println(count);
		
		System.out.println(getLength("What a name"));
	}

	public static int getLength(String str) {
		int i = 0;
		try {
			while (true) {
				str.charAt(i);
				i++;
			}
		} catch (IndexOutOfBoundsException e) {
			return i;
		}

	}

}
