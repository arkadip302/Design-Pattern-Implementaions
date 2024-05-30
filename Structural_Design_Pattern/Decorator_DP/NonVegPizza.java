package Structural_Design_Pattern.Decorator_DP;

public class NonVegPizza extends Pizza {

    @Override
    Integer cost() {
        return 200;
    }

    @Override
    String getDesc() {
        return "Non Veg Pizza";
    }

}
