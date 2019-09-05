package enums.method;

public enum Operation {

	PLUS {
		@Override
		void calculate(int a, int b) {
			System.out.println("Sum: " + (a+b));
		}
	}, MINUS {
		@Override
		void calculate(int a, int b) {
			System.out.println("Subtract: " + (a-b));
		}
	}, MULTIPLY {
		@Override
		void calculate(int a, int b) {
			System.out.println("Multiply: " + (a*b));
		}
	}, DIVIDE {
		@Override
		void calculate(int a, int b) {
			System.out.println("Divide: " + (a/b));
		}
	};
	
	abstract void calculate(int a, int b);
}
