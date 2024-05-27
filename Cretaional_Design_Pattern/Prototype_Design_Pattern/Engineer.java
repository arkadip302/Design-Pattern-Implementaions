package Cretaional_Design_Pattern.Prototype_Design_Pattern;

public class Engineer extends Profession {

    @Override
    public String DayOfWork() {

        return "20/21";
    }

    @Override
    public boolean isWeekEndLevaes() {
        return true;
    }

    @Override
    public String getDesignation() {
        return "Software Engineer";
    }

    @Override
    public Double avgSalary() {
        return Double.parseDouble("130000");
    }
}
