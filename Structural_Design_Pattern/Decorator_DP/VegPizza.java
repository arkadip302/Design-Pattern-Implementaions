package Structural_Design_Pattern.Decorator_DP;

public class VegPizza extends Pizza {

    @Override
    Integer cost() {
        return 100;
    }

    @Override
    String getDesc() {
        return "Veg Pizza";
    }

}
