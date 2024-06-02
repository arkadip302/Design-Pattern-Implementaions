package Structural_Design_Pattern.Composite_DP;

public class ClientClass {

    public static void main(String[] args) {
        Component mouse = new Leaf(300, "Mouse");
        Component keyboard = new Leaf(800, "Keyboard");
        Component monitor = new Leaf(8000, "Monitor");
        Component hdd = new Leaf(6000, "HDD");
        Component ssd = new Leaf(6000, "SSD");

        Composite peripheral = new Composite("Peripheral");
        peripheral.addComponents(keyboard);
        peripheral.addComponents(mouse);
        peripheral.addComponents(monitor);

        Composite cpu = new Composite("CPU");
        cpu.addComponents(hdd);
        cpu.addComponents(ssd);

        Composite computer = new Composite("Computer");
        computer.addComponents(peripheral);
        computer.addComponents(cpu);

        // ------------------------------------------------------------------------------------------------
        peripheral.showPrice();

    }
}
