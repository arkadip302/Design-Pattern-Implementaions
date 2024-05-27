package Structural_Design_Pattern.Adapter_DP;

public class LightiningCharger implements Charger {

    @Override
    public String getChargerType() {
        return "Lightning";
    }

    @Override
    public Double getVoltage() {
        return Double.parseDouble("30");
    }

}
