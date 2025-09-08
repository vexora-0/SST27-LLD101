package beverages_decorator;

public class Client {

	public static void main(String[] args) {

		Beverage coffee = new Cappuccino();
		System.out.println("Base: " + coffee.cost());

		coffee = new Latte(coffee);
		System.out.println("+Latte: " + coffee.cost());

		coffee = new ChocoShake(coffee);
		System.out.println("+Choco: " + coffee.cost());

	}

}