package JavaBasics.String;

public class MaxAndMinOccurenceOfACharacter {

	public static void main(String[] args) {

		String str = "grass is greener on the other side";

		int freq[] = new int[str.length()];

		char minChar = str.charAt(0);
		char maxChar = str.charAt(0);

		int min, max;

		char string[] = str.toCharArray();

		// count each word of given string and store in array frequency

		for (int i = 0; i < string.length; i++) {
			freq[i] = 1;

			for (int j = i + 1; j < string.length; j++) {

				if (string[i] == string[j] && string[i] != ' ' && string[i] != 'O') {
					freq[i]++;

					// Set string[j] to 0 to avoid printing visited character
					string[j] = 'O';
				}
			}
		}
		//Determine minimum and maximum occurring characters    
		   min =max = freq[0];
		   
		   for(int i=0;i<freq.length;i++) {
			   
			 //If min is greater than frequency of a character     
		          //then, store frequency in min and corresponding character in minChar    
			   
			   if(min >freq[i] && freq[i] !='O') {
				   min = freq[i];
				   minChar = string[i];
			   }
			 //If max is less than frequency of a character     
		          //then, store frequency in max and corresponding character in maxChar    
		          if(max < freq[i]) {    
		              max = freq[i];    
		              maxChar = string[i];    
		          }  
		   } 
		    System.out.println("Minimum occurring character: " + minChar);    
	          System.out.println("Maximum occurring character: " + maxChar);   
		      } 
		       
		     
		   }

	
