package dynamic.array;

public class Main {

	public static void main(String[] args) {
		DynamicArray<Character> obj = 
				new DynamicArray<Character>();
		
		obj.add('a');
		System.out.println(obj.size());
		
		obj.add('b');
		System.out.println(obj.size());
		
		System.out.println("Data: " + obj.get(0));
		System.out.println("Data: " + obj.get(1));
		
	}

}
