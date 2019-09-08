package customsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomSort {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		Collections.addAll(students, 
				new Student("bo", 33, "myoma", 100_000),
				new Student("aung", 24, "bishop-home", 20_000),
				new Student("din", 11, "augustine", 300_000)
				);
		
		System.out.println("Origin: " + students);
		System.out.println();
		
		Collections.sort(students);
		System.out.println("Sorted: ");
		System.out.println(students);
		System.out.println();
		
		@SuppressWarnings("unused")
		Comparator<Student> byAge = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o1.getAge(), o2.getAge());
			}
		};
		
		Comparator<Student> byFees = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return (int)(o1.getFees() - o2.getFees());
			}
		};
		
		Collections.sort(students, byFees);
		System.out.println("Sorted by Fees: ");
		System.out.println("================");
		System.out.println(students);
		System.out.println();
		
	}

}
