package Cretaional_Design_Pattern.Prototype_Design_Pattern;

public class Teacher extends Profession {

    @Override
    public String DayOfWork() {

        return "30";
    }

    @Override
    public boolean isWeekEndLevaes() {
        return false;
    }

    @Override
    public String getDesignation() {
        return "Associate Professor";
    }

    @Override
    public Double avgSalary() {
        return Double.parseDouble("12700");
    }

}
