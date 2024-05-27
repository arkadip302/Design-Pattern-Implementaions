package Structural_Design_Pattern.Adapter_DP;

public class ConvertingIphoneToAndroidAdapter implements Mobile {
    TypeCCharger cCharger;

    public ConvertingIphoneToAndroidAdapter(Mobile mobile) {
        cCharger = (TypeCCharger) mobile.getChargerUsed();
    }

    @Override
    public String getPhoneType() {
        return "Iphone";
    }

    @Override
    public Charger getChargerUsed() {
        return cCharger;
    }

}
