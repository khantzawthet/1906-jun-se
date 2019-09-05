package varargs;

public class After {

	public static void main(String[] args) {
		show();
		show(1);
		show(1,2);
		show(new int[] {12,3,45,6});
		
		int [] numbers = {1,22,3};
		System.out.println(numbers);
		
//		System.out.printf("%s %d %s","Hello ",1," Testing");
		
	}
	
	static void show(int ... number) {
		for (int i : number) {
			System.out.println(i);
		}
		System.out.println("Terminated.");
		System.out.println();
	}
}
