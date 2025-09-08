package beverages_decorator;

public abstract class BeverageDecorator extends Beverage {
    Beverage b;

    public BeverageDecorator(Beverage b) {
        this.b = b;
    }
}
