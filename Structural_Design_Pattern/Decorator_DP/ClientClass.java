package Structural_Design_Pattern.Decorator_DP;

public class ClientClass {
    public static void main(String[] args) {
        Pizza pizza = new ExtraCheeseTopping(new VegPizza());

        System.out.println(pizza.getDesc() + "\nCost : -" + pizza.cost());

    }
}
