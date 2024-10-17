package JavaBasics.String;
import java.lang.String;
public class FirstLetterUpperCaseProgram {

	public static void main(String[] args) {

		String name = "When managing an Appium cloud";

		String[] newName = name.split(" ");  //{salute,the,nation};

		String capitalizeWord = "";                                                                      // 1. Split the string
		for (int i = 0; i < newName.length; i++) {                                              // 2. iterate the value and store the value in String variable
			String str = "";                                                                                    // 3. iterate again with respect to i  and store the value in char variable
			for (int j = 0; j < newName[i].length(); j++) {                                   // 4. Use if else condition 
				char chr = ' ';                                                                                // 5. in if statement store the value into same char variable wrt i 
                                                                                                                    // 6. add above String and char variable
				if (j == 0) {                                                                                   // 7. use upper case method
					chr = newName[i].charAt(j);                                                 // 8. in else statement store the value into same char variable wrt i 
					str = str + chr;                                                                       // 9. add above String and char variable
					str = str.toUpperCase();                                                      // 10. Add that string variable in new string variable with an empty string
				} else {                                                                                    
					chr = newName[i].charAt(j);
					str = str + chr;
				};
			}
			capitalizeWord = capitalizeWord + str + " ";
		}

		System.out.println(capitalizeWord);

	}

}
