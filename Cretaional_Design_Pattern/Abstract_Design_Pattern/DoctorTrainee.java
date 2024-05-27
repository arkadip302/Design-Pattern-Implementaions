package Cretaional_Design_Pattern.Abstract_Design_Pattern;

public class DoctorTrainee implements Profession {

    @Override
    public String DayOfWork() {

        return "20";
    }

    @Override
    public boolean isWeekEndLevaes() {
        return true;
    }

    @Override
    public String getDesignation() {
        return "Associate Pharma Consultant";
    }

    @Override
    public Double avgSalary() {
        return Double.parseDouble("1200000.90");
    }

}
