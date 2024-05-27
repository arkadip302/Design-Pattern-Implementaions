package Cretaional_Design_Pattern.Prototype_Design_Pattern;

import java.util.HashMap;
import java.util.Map;

public class CachedInstanceLoaded {

    private static Map<Integer, Profession> map = new HashMap<>();

    static Profession getObjectsBasedOnId(Integer id) throws CloneNotSupportedException {
        Profession profession = map.get(id);
        return (Profession) profession.clonning();
    }

    static void loadToChache() {
        Doctor doctor = new Doctor();
        doctor.id = 1;
        map.put(1, doctor);
        Teacher teacher = new Teacher();
        teacher.id = 2;
        map.put(2, teacher);
        Engineer engineer = new Engineer();
        engineer.id = 3;
        map.put(3, engineer);
    }
}
