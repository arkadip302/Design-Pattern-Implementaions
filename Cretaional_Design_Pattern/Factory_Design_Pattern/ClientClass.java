package Cretaional_Design_Pattern.Factory_Design_Pattern;

public class ClientClass {
    public static void main(String[] args) {
        FactoryPatternImpl factoryPatternImpl = new FactoryPatternImpl();
        Computer Asus360Laptop = factoryPatternImpl.getComputerDetails("Asus360");
        System.out.println(
                Asus360Laptop.proccessorAvaialble() + " " + Asus360Laptop.ssd() + " " + Asus360Laptop.hdd() + " "
                        + Asus360Laptop.core());
        System.out.println("---------------------------------------------------------------------------");
        Computer desktop = factoryPatternImpl.getComputerDetails("Desktop");
        System.out.println(
                desktop.proccessorAvaialble() + " " + desktop.ssd() + " " + desktop.hdd() + " " + desktop.core());
        System.out.println("---------------------------------------------------------------------------");
        Computer mac = factoryPatternImpl.getComputerDetails("MacBookAir");
        System.out.println(
                mac.proccessorAvaialble() + " " + mac.ssd() + " " + mac.hdd() + " " + mac.core());
        System.out.println("---------------------------------------------------------------------------");
    }
}
