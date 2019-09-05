package sample;

public abstract class Decorator implements ICoffee{

	protected ICoffee iCoffee;

	public Decorator(ICoffee iCoffee) {
		this.iCoffee = iCoffee;
	}
	
	
}
