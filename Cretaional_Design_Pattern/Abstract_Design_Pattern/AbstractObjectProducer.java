package Cretaional_Design_Pattern.Abstract_Design_Pattern;

public class AbstractObjectProducer {
    public static AbstractClass isATraineeRequired(boolean isATrainee) {
        if (isATrainee) {
            System.out.println("Creating A New Trainee Object");
            return new AbstractTrainee();
        } else {
            System.out.println("Creating A New Proffesional Object");
            return new AbstractProfessional();
        }
    }
}
