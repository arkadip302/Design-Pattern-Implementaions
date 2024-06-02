package Structural_Design_Pattern.Composite_DP;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    String name;

    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponents(Component component) {
        components.add(component);
    }

    @Override
    public void showPrice() {
        System.out.println("Name - " + name);
        for (Component c : components) {
            c.showPrice();
        }
    }

}
