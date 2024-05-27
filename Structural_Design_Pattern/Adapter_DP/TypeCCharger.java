package Structural_Design_Pattern.Adapter_DP;

public class TypeCCharger implements Charger {
    @Override
    public String getChargerType() {
        return "Type-C";
    }

    @Override
    public Double getVoltage() {
        return Double.parseDouble("65.05");
    }
}
