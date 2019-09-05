package sample;

public class Application {

	public static void main(String[] args) {
		ICoffee coffee = new SugarDecorator(
				new SugarDecorator(
				new MilkDecorator(
						new PlainCoffee())));
		
		System.out.println("Ingredients : " + coffee.showIngredients());
		System.out.println("Price: " + coffee.getPrice());
		
	}
}
