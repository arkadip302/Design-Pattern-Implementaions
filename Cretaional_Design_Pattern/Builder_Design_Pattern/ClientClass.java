package Cretaional_Design_Pattern.Builder_Design_Pattern;

public class ClientClass {
    public static void main(String[] args) {
        GamingLaptop gamingLaptop = new GamingLaptop();
        Director director = new Director(gamingLaptop);
        director.createInstance();
        Laptop laptop = director.buildObjectToReturn();

        System.out.println("---------------------------------------------------------------------------");

        System.out.println("Laptop Screen : " + laptop.screenSize + " ; Cores : " + laptop.core + " ; GPU : "
                + laptop.gpuDetails + " ; Ram : " + laptop.ramDetails);

        System.out.println("---------------------------------------------------------------------------");

        OfficeLaptop officeLaptop = new OfficeLaptop();
        Director director2 = new Director(officeLaptop);
        director2.createInstance();
        Laptop laptop2 = director2.buildObjectToReturn();

        System.out.println("---------------------------------------------------------------------------");

        System.out.println("Laptop Screen : " + laptop2.screenSize + " ; Cores : " + laptop2.core + " ; GPU : "
                + laptop2.gpuDetails + " ; Ram : " + laptop2.ramDetails);

        System.out.println("---------------------------------------------------------------------------");
    }
}
