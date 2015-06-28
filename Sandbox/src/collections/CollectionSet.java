package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {

		Set<String> bands = new HashSet<String>();

		bands.add("Rise Against");
		bands.add("The Story So Far");
		bands.add("Blink 182");
		bands.add("Story of the Year");
		bands.add("Hawthorne Heights");
		bands.add("Simple Plan");
		bands.add("Sublime");
		bands.add("Hoobastank");
		bands.add("Evans Blue");

		System.out.println("This is the set of bands: " + bands);

		// With sets you can not remove using an index due to the order of the
		// elements depends on the Set implementation.
		// bands.remove(0); This does not work.
		bands.remove("Sublime");
		bands.remove("Blink 182");

		System.out.println();

		List<String> moreBands = new ArrayList<String>();

		moreBands.add("Alesana");
		moreBands.add("Dropping Daylight");
		moreBands.add("Breaking Benjamin");
		moreBands.add("Evans Blue");

		Set<String> moreBandsSet = new HashSet<String>(moreBands);

		// Notice that this set is also not in the order that is listed above.
		System.out.println("Another set of bands: " + moreBandsSet);
		System.out.println();

		displayAll(bands);
		System.out.println();
		System.out.println();

		// Will find if there is a common input in the two sets and print out
		// that commonality
		Set<String> intersection = new HashSet<String>(bands);
		intersection.retainAll(moreBandsSet);
		
		// Prints out what the two sets have in common.
		System.out.println(intersection);

	}

	// This class makes no guarantees as to the iteration order
	// of the set; in particular, it does not guarantee that the
	// order will remain constant over time.
	static void displayAll(Collection<String> myBandCol) {
		Iterator<String> bandItr = myBandCol.iterator();
		while (bandItr.hasNext()) {
			String band = (String) bandItr.next();
			System.out.print(band + "[Punk Rock], ");
		}
	}
}