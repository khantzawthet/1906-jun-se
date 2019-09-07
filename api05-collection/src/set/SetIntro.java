package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetIntro {
	
	public static void main(String[] args) {
		
		Set<Integer> hashSet = new HashSet<>();
		Set<Integer> treeSet = new TreeSet<>();
		Set<Integer> linkSet = new LinkedHashSet<Integer>();
		
		for (int i = 10; i > 0; i--) {
			hashSet.add(i);
			treeSet.add(i);
			linkSet.add(i);
		}
		// won't add because object is already exists.
		hashSet.add(9);
		
		hashSet.add(99);
		treeSet.add(99);
		linkSet.add(99);
		
		linkSet.add(22);
		
		linkSet.remove(9);
		
		System.out.println("Collection size: " + hashSet.size());
		System.out.println("Hash Set: " + hashSet);
		System.out.println("Tree Set: " + treeSet);
		System.out.println("Link Hash Set: " + linkSet);
	}

}
