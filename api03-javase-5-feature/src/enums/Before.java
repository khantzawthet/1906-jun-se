package enums;

public class Before {
	
	static interface Hobby {
		static final int Reading = 1;
		static final int Singing = 2;
		static final int Writing = 3;
		static final int Other = 4;
		
	}
	
	public static void main(String[] args) {
		int hobby = Hobby.Reading;
		System.out.println(hobby);
	}

}
