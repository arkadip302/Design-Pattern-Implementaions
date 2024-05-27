package Structural_Design_Pattern.Facade_DP;

public class ClientClass {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Monitor monitor = new Monitor();
        Mouse mouse = new Mouse();
        Keyboard keyboard = new Keyboard();
        // Instanting All The Sub Classes

        SetupFacade facade = new SetupFacade(mouse, laptop, monitor, keyboard);
        facade.switchOnSetup();
        facade.switchOffMonitor();
        facade.switchOffSetup();
    }
}
