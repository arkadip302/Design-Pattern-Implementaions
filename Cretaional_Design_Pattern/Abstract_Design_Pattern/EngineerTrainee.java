package Cretaional_Design_Pattern.Abstract_Design_Pattern;

public class EngineerTrainee implements Profession {

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
        return "Associate Software Engineer";
    }

    @Override
    public Double avgSalary() {
        return Double.parseDouble("12700");
    }

}
