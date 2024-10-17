package JavaBasics.String;

public class SpaceReplaceWithCharacter {

	public static void main(String[] args) {
		String str = "What an awesome wheather is";

		char ch = '-';

		String s = str.replace(' ', ch);
		
		System.out.println("After replacement :" + s);

	}

}
