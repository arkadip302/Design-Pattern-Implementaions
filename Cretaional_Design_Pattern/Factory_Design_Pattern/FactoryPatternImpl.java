package Cretaional_Design_Pattern.Factory_Design_Pattern;

public class FactoryPatternImpl {

    public Computer getComputerDetails(String comString) {

        switch (comString) {
            case "Asus360":
                System.out.println("Returning Asus 360 Object");
                return new Asus360();
            case "Desktop":
                System.out.println("Returning Desktop Object");
                return new Desktop();
            case "MacBookAir":
                System.out.println("Returning MacBookAir Object");
                return new MacBookAir();
            default:
                return null;
        }
    }

}
