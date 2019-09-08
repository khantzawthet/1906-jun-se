package wildcard;

import java.util.Arrays;
import java.util.List;

public class WildCardSample {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7);
		List<Double> doubleList = Arrays.asList(1.0, 2.3, 4.5);
		List<String> strList = Arrays.asList("hello","java","developer");
		
		showData(intList);
		showData(doubleList);
		showData(strList);
	}
	
	static void showData(List<?> list){
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
