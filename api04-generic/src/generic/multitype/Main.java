package generic.multitype;

public class Main {

	public static void main(String[] args) {
		
		OrderPair<String, String> obj1 = new OrderPair<>("Kyaw Kyaw", "Myoma");
		System.out.println(obj1.getKey() + ", " + obj1.getValue());
		
		OrderPair<String, Double> fruit = new OrderPair<>("Orange", 500.0);
		System.out.println(fruit.getKey() + ": " + fruit.getValue());
		
	}
}
