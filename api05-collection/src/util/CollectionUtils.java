package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionUtils {

	public static void main(String[] args) {
		
		String[] data = {"Spade", "Club", "Diamond", "Heart"};
		
		// Unmodifiable List
		List<String> list = Arrays.asList(data);
		
//		list.add("hello");
		
		System.out.println("Origin: " + list);
		
		Collections.shuffle(list);
		System.out.println("Shuffle: " + list);
		
		Collections.sort(list);
		System.out.println("Sorted: " + list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Reversed: " + list);
		
		List<Student> stu = new ArrayList<Student>();
		Collections.addAll(stu, 
				new Student("kyaw"), 
				new Student("aung"));
		
//		Collections.sort(stu);
		
		
	}
}
