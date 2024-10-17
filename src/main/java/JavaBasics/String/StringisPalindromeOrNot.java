package JavaBasics.String;

public class StringisPalindromeOrNot {

	public static void main(String[] args) {
		String str = "Kayak";
		boolean flag = true;

		String s = str.toLowerCase();

		// iterate the string forward and backward and compare each character till the
		// middle

		for (int i = 0; i < s.length() / 2; i++) {

			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
