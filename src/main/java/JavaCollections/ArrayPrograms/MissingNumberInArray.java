package JavaCollections.ArrayPrograms;

public class MissingNumberInArray {

	public static void main(String[] args) {
		 int num[] = {1,2,3,5};
	int missingNo= 	 missingNum(num, 5);
	System.out.println(missingNo);

	}
	 public static int missingNum(int num[], int totalCount) {
		 int expCount = totalCount * ((totalCount +1)/2);
		 int actualCount = 0;
		 
		 for(int i : num) {
			 actualCount +=i;
		 }
		 return expCount-actualCount;
	 }
	
	
	
	
	

}
