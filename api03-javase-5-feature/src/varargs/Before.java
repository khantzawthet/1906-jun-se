package varargs;

public class Before {

	public static void main(String[] args) {
		show(1);
		show(1,2);
		show(new int[] {12,3,45,6});
	}

	private static void show(int[] array) {
		for (int i : array) {
			System.out.println(i);
		}
	}

	private static void show(int i, int j) {
		System.out.println(i);
		System.out.println(j);
	}

	private static void show(int i) {
		System.out.println(i);
	}
	
	
}
