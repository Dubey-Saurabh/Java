package JavaCollections.HashMapPrograms;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapIntoArrayList {

	public static void main(String[] args) {

		Map<String, Integer> compMap = new HashMap<String, Integer>();
		compMap.put("Google", 10000);
		compMap.put("Amazon", 20000);
		compMap.put("Apple", 30000);
		compMap.put("Yahoo", 40000);
		compMap.put("Cisco", 50000);
		

		Iterator it = compMap.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry) it.next();
			System.out.println(pairs.getKey() + " : " + pairs.getValue());

			// Convert HashMap into ArrayList

		}
		ArrayList<String> compList = new ArrayList<String>(compMap.keySet());
		System.out.println(compList);
		for (String t : compList) {
			System.out.println(t);
		}
		System.out.println(" Employee numbers will be below :");
		ArrayList<Integer> empList = new ArrayList<Integer>(compMap.values());
		System.out.println(empList);
		for (Integer e : empList) {
			System.out.println(e);
		}

	}

}
