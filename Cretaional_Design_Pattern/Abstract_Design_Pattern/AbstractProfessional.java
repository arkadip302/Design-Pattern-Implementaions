package Cretaional_Design_Pattern.Abstract_Design_Pattern;

public class AbstractProfessional extends AbstractClass {

    @Override
    Profession getProfessionBasedOnString(String professionString) {
        switch (professionString) {
            case "Teacher":
                return new Teacher();
            case "Doctor":
                return new Doctor();
            case "Engineer":
                return new Engineer();
            default:
                return null;
        }
    }

}
