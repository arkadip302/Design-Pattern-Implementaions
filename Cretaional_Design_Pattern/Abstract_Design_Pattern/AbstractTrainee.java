package Cretaional_Design_Pattern.Abstract_Design_Pattern;

public class AbstractTrainee extends AbstractClass {

    @Override
    Profession getProfessionBasedOnString(String professionString) {
        switch (professionString) {
            case "Teacher":
                return new TeacherTrainee();
            case "Doctor":
                return new DoctorTrainee();
            case "Engineer":
                return new EngineerTrainee();
            default:
                return null;
        }
    }

}
