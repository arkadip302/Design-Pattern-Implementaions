package Structural_Design_Pattern.Adapter_DP;

public class Samsung implements Mobile {

    @Override
    public String getPhoneType() {
        return "Android";
    }

    @Override
    public Charger getChargerUsed() {
        TypeCCharger cCharger = new TypeCCharger();
        cCharger.getChargerType();
        cCharger.getVoltage();
        return cCharger;
    }

}
