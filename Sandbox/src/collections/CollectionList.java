package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionList {

	public static void main(String args[]) {
		
		List<String> transformers = new ArrayList<String>();
		
		//Add elements into arrayList that is named transformers
		transformers.add("Optimus Prime");
		transformers.add("BumbleBee");
		transformers.add("IronHide");
		transformers.add("Jazz");
		transformers.add("Ratchet");
		transformers.add("Sideswipe");
		
		//Displaying the current elements inside the arrayList named transformers
		System.out.println("Currently the array list has the following elements: "+ transformers);
	
		//Remove elements from an arrayList
		transformers.remove("Jazz");
		
		//Displaying the current elements inside the arrayList named transformers after the removing of an element
		System.out.println("Currently the array list has the following elements: "+ transformers);
		
		//Removing element by its index is possible as well
		transformers.remove(4);
		
		//Displaying the current elements inside the arrayList named transformers after the removal of element with index value of 4
		System.out.println("Currently the array list has the following elements: "+ transformers);
		
		// Modifying objects being iterated
		ListIterator<String> botsIterator = transformers.listIterator();
		
		while(botsIterator.hasNext()) {
	         Object element = botsIterator.next();
	         botsIterator.set(element + " " + "[AutoBot] ");
	      }
		
		System.out.println("Currently the array list has the following elements: "+ transformers);
	}
	
	
	
	
	
	
	
}
