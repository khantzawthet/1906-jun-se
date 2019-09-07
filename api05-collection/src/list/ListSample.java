package list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListSample {
	
	public static void main(String[] args) {
		
		List<String> names = new LinkedList<String>();
		
		names.add("kyaw");
		
		Collections.addAll(names, "mg", "Aung", "kyaw", "kyaw", "tun", "thidar");
		System.out.println(names.size() + " names in total.");
		
		// traverse in collection with for-each
		for (String s : names) {
			System.out.print(s.concat(". "));
		}
		
		String remove = "kyaw";
		
		System.out.println();
		System.out.println("Before remove: " + names);
		
		// remove all equals object will throws exception
//		for (String s : names) {
//			if(s.equals(remove)) {
//				names.remove(remove);
//			}
//		}
		
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext()) {
			if(itr.next().equals(remove)) {
				itr.remove();
			}
		}
		
		System.out.println("After remove: " + names);
	}
}
