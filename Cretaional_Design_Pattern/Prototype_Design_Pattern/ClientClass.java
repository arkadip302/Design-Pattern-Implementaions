package Cretaional_Design_Pattern.Prototype_Design_Pattern;

public class ClientClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        CachedInstanceLoaded.loadToChache();

        Doctor doctor = (Doctor) CachedInstanceLoaded.getObjectsBasedOnId(1);
        System.out.println("Doctor Designation -" + doctor.getDesignation());

        Teacher teacher = (Teacher) CachedInstanceLoaded.getObjectsBasedOnId(2);
        System.out.println("Teacher Designation -" + teacher.getDesignation());

        Engineer engineer = (Engineer) CachedInstanceLoaded.getObjectsBasedOnId(3);
        System.out.println("Engineer Designation " + engineer.getDesignation());

        Doctor doctor2 = (Doctor) CachedInstanceLoaded.getObjectsBasedOnId(1);
        System.out.println("Doctor Designation " + doctor2.getDesignation());
        System.out.println("---------------------------------------------------------------------------");
        System.err.println("Doctor 1 HasCode : " + doctor.hashCode());
        System.err.println("Doctor 2 HasCode : " + doctor2.hashCode());

    }
}
