package collections;

import java.util.TreeMap;

public class CollectionTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Object, Object> bullpen = new TreeMap<Object, Object>();

		bullpen.put("Pedro Baez", 52);
		bullpen.put("Yimi Garcia", 63);
		bullpen.put("J.P. Howell", 56);
		bullpen.put("Kenley Jansen", 74);
		bullpen.put("Adam Liberatore", 36);
		bullpen.put("Juan Nicasio", 12);
		bullpen.put("Joel Peralta", 62);
		
		System.out.println("Total dodgers in the Bullpen: " + bullpen.size());
		
		bullpen.remove("Pedro Baez");
		System.out.println("Total dodgers in the Bullpen: " + bullpen.size());
		
		System.out.println();
		
		for (Object key : bullpen.keySet())
			System.out.println(key + " - Jersey Number: " + bullpen.get(key));
		System.out.println();
		
		System.out.println("Highest key: " + bullpen.lastKey());
		System.out.println("Lowest key: " + bullpen.firstKey());

		// Tree Map will print out the bullpen in alphabetical order unlike the similar HashMap.
		
	}

}
