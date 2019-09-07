package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterate {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		for (int i = 10; i > 0; i--) {
			set.add(String.valueOf(i));
		}
		Collections.addAll(set, "22");
		
		// traverse in collection
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			String obj = itr.next();
			System.out.println("Value in Collection: " + obj);
		}
		
		
	}
}
