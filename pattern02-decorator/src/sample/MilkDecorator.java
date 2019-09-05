package sample;

public class MilkDecorator extends Decorator{

	public MilkDecorator(ICoffee iCoffee) {
		super(iCoffee);
	}

	@Override
	public String showIngredients() {
		return iCoffee.showIngredients().concat(", Milk ");
	}
	
	@Override
	public int getPrice() {
		return iCoffee.getPrice() + 2;
	}
}
