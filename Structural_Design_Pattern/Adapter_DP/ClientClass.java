package Structural_Design_Pattern.Adapter_DP;

public class ClientClass {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------------------");
        Mobile mobile = new Iphone();
        System.out.println(mobile.getPhoneType() + " " + mobile.getChargerUsed().getVoltage() + " "
                + mobile.getChargerUsed().getChargerType());
        System.out.println("---------------------------------------------------------------------------");

        Mobile mobile2 = new Samsung();
        System.out.println(mobile2.getPhoneType() + " " + mobile2.getChargerUsed().getVoltage() + " "
                + mobile2.getChargerUsed().getChargerType());
        System.out.println("---------------------------------------------------------------------------");

        Mobile mobile3 = new ConvertingIphoneToAndroidAdapter(mobile2);

        System.out.println(mobile3.getPhoneType() + " " + mobile3.getChargerUsed().getVoltage() + " "
                + mobile3.getChargerUsed().getChargerType());
        System.out.println("---------------------------------------------------------------------------");
    }
}
