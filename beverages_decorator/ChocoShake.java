package beverages_decorator;

public class ChocoShake extends BeverageDecorator {

    public ChocoShake(Beverage b) {
        super(b);
    }

    @Override
    public int cost() {
        return b.cost() + 8;
    }
}
