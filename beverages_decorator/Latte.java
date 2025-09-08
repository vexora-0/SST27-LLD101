package beverages_decorator;

public class Latte extends BeverageDecorator {

	public Latte(Beverage b) {
		super(b);
	}

	@Override
	public int cost() {
		return b.cost() + 5;
	}
}