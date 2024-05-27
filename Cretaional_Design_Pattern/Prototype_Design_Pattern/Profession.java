package Cretaional_Design_Pattern.Prototype_Design_Pattern;

public abstract class Profession implements Cloneable {
    Integer id;

    abstract String DayOfWork();

    abstract boolean isWeekEndLevaes();

    abstract String getDesignation();

    abstract Double avgSalary();

    Object clonning() throws CloneNotSupportedException {
        return super.clone();
    }

}
