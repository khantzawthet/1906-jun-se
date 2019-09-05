package sample;

public class SugarDecorator extends Decorator{

	public SugarDecorator(ICoffee iCoffee) {
		super(iCoffee);
	}

	@Override
	public String showIngredients() {
		return iCoffee.showIngredients().concat(", Sugar ");
	}

	@Override
	public int getPrice() {
		return iCoffee.getPrice() + 1;
	}

}
