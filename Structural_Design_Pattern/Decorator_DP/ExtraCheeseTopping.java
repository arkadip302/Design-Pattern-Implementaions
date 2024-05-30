package Structural_Design_Pattern.Decorator_DP;

public class ExtraCheeseTopping extends Topping {

    Pizza pizza;

    public ExtraCheeseTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    Integer cost() {
        return pizza.cost() + 30;
    }

    @Override
    String getDesc() {
        return this.pizza.getDesc() + " With Extra Topping";
    }

}
