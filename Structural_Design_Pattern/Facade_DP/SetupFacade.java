package Structural_Design_Pattern.Facade_DP;

public class SetupFacade {
    Mouse mouse;
    Laptop laptop;
    Monitor monitor;
    Keyboard keyboard;

    public SetupFacade(Mouse mouse, Laptop laptop, Monitor monitor, Keyboard keyboard) {
        this.keyboard = keyboard;
        this.laptop = laptop;
        this.monitor = monitor;
        this.mouse = mouse;
    }

    public void switchOnSetup() {
        mouse.active = true;
        laptop.active = true;
        monitor.active = true;
        keyboard.active = true;
        mouse.activeBluetooth = true;
        mouse.isConnectedToLaptop = true;
        keyboard.activeBluetooth = true;
        keyboard.isConnectedToLaptop = true;
        monitor.isConnectedToLaptop = true;
        monitor.projectionType = "Extends";

        System.out.println("Switched On Setup");

    }

    public void switchOffSetup() {
        mouse.active = false;
        laptop.active = false;
        monitor.active = false;
        keyboard.active = false;
        mouse.activeBluetooth = false;
        mouse.isConnectedToLaptop = false;
        keyboard.activeBluetooth = false;
        keyboard.isConnectedToLaptop = false;
        monitor.isConnectedToLaptop = false;

        System.out.println("Switched Off Setup");
    }

    public void switchOffMonitor() {
        monitor.active = false;
        monitor.isConnectedToLaptop = false;
        System.out.println("Switched Off Monitor");
    }
}
