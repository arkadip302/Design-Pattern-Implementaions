package Cretaional_Design_Pattern.Abstract_Design_Pattern;

public class ClientClass {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(" Object Of Trainee Teacher");
        AbstractClass abstractClass = AbstractObjectProducer.isATraineeRequired(true);
        Profession profession = abstractClass.getProfessionBasedOnString("Teacher");
        System.out.println(
                "Days Of Work :" + profession.DayOfWork() + " .Has Weekend Leaves : " + profession.isWeekEndLevaes()
                        + " . Designation : " + profession.getDesignation() + " . Avg Salary : "
                        + profession.avgSalary());
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(" Object Of  Teacher");
        abstractClass = AbstractObjectProducer.isATraineeRequired(false);
        profession = abstractClass.getProfessionBasedOnString("Teacher");
        System.out.println(
                "Days Of Work :" + profession.DayOfWork() + " .Has Weekend Leaves : " + profession.isWeekEndLevaes()
                        + " . Designation : " + profession.getDesignation() + " . Avg Salary : "
                        + profession.avgSalary());

        System.out.println("---------------------------------------------------------------------------");
        System.out.println(" Object Of  Trainee Engineer !!");
        abstractClass = AbstractObjectProducer.isATraineeRequired(true);
        profession = abstractClass.getProfessionBasedOnString("Engineer");
        System.out.println(
                "Days Of Work :" + profession.DayOfWork() + " .Has Weekend Leaves : " + profession.isWeekEndLevaes()
                        + " . Designation : " + profession.getDesignation() + " . Avg Salary : "
                        + profession.avgSalary());
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(" Object Of Senior Engineer !!");
        abstractClass = AbstractObjectProducer.isATraineeRequired(false);
        profession = abstractClass.getProfessionBasedOnString("Engineer");
        System.out.println(
                "Days Of Work :" + profession.DayOfWork() + " .Has Weekend Leaves : " + profession.isWeekEndLevaes()
                        + " . Designation : " + profession.getDesignation() + " . Avg Salary : "
                        + profession.avgSalary());
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");
    }
}
