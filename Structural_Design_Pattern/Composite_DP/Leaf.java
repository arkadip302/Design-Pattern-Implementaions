package Structural_Design_Pattern.Composite_DP;

public class Leaf implements Component {

    int price;
    String name;

    public Leaf(int price, String name) {
        super();
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(name + " : " + price);
    }

}
