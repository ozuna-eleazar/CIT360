package collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionHashMap {

	public static void main(String[] args) {
		Map<Integer, String> dodgers = new HashMap<Integer, String>();

		dodgers.put(31, "Joc Pederson");
		dodgers.put(11, "Jimmy Rollins");
		dodgers.put(23, "Adrian Gonzalez");
		dodgers.put(47, "Howie Kendrick");
		dodgers.put(9, "Yasmani Grandal");
		dodgers.put(16, "Andre Ethier");
		dodgers.put(2, "Juan Uribe");
		dodgers.put(17, "A.J. Ellis");
		dodgers.put(21, "Zack Greinke");

		System.out.println("Total dodgers: " + dodgers.size());

		// Remove Number 21 Zack Greinke
		dodgers.remove(21);
		// Print out total number of dodgers which is now 8
		System.out.println("Total dodgers: " + dodgers.size());
		// Adding of new pitcher #22 Clayton Kershaw
		dodgers.put(22, "Clayton Kershaw");
		// Print out who our new pitcher is
		System.out.println("New Pitcher: " + dodgers.get(22));

		System.out.println();
		System.out.println();

		Map<String, Integer> bullpen = new HashMap<String, Integer>();

		bullpen.put("Pedro Baez", 52);
		bullpen.put("Yimi Garcia", 63);
		bullpen.put("J.P. Howell", 56);
		bullpen.put("Kenley Jansen", 74);
		bullpen.put("Adam Liberatore", 36);
		bullpen.put("Juan Nicasio", 12);
		bullpen.put("Joel Peralta", 62);

		System.out.println("Total dodgers in the Bullpen: " + bullpen.size());

		// Iterate over all bullpen, using the keySet method.

		for (String key : bullpen.keySet())
			System.out.println(key + " - Jersey Number: " + bullpen.get(key));
		System.out.println();

		// Clear all the values
		dodgers.clear();
		System.out.println("How many dodgers after being cleared: "
				+ dodgers.size());

	}

}
