package Structural_Design_Pattern.Adapter_DP;

public class Iphone implements Mobile {

    @Override
    public String getPhoneType() {
        return "Iphone";
    }

    @Override
    public Charger getChargerUsed() {
        LightiningCharger cCharger = new LightiningCharger();
        cCharger.getChargerType();
        cCharger.getVoltage();
        return cCharger;
    }

}
