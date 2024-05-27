package Cretaional_Design_Pattern.Prototype_Design_Pattern;

public class Doctor extends Profession {

    @Override
    public String DayOfWork() {

        return "30/31";
    }

    @Override
    public boolean isWeekEndLevaes() {
        return false;
    }

    @Override
    public String getDesignation() {
        return "Pharma Consultant";
    }

    @Override
    public Double avgSalary() {
        return Double.parseDouble("1200000.90");
    }

}
