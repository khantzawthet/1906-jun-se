package sample;

public class PlainCoffee implements ICoffee{

	@Override
	public String showIngredients() {
		return "Plain Coffee";
	}

	@Override
	public int getPrice() {
		return 2;
	}

}
