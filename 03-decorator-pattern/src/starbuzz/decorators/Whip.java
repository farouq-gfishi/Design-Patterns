package starbuzz.decorators;

import starbuzz.types.Beverage;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
