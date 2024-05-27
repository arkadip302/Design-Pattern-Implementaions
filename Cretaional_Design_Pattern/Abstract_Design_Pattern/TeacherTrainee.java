package Cretaional_Design_Pattern.Abstract_Design_Pattern;

public class TeacherTrainee implements Profession {

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
        return "Professor";
    }

    @Override
    public Double avgSalary() {
        return Double.parseDouble("122700");
    }

}
