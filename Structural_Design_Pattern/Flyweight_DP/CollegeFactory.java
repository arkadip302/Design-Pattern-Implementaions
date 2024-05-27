package Structural_Design_Pattern.Flyweight_DP;

import java.util.HashMap;
import java.util.Map;

public class CollegeFactory {

    private Map<String, College> map = new HashMap<>();

    College getCollegeDetailsForBtech(String college) {
        String checkKey = college + "-BTech";
        if (map.get(checkKey) != null) {
            return map.get(checkKey);
        } else {
            College bTech = new BTech(college);
            bTech.loadCommonResource();
            map.put(checkKey, bTech);
            return bTech;
        }

    }

    College getCollegeDetailsForMasters(String college) {
        String checkKey = college + "-MTech";
        if (map.get(checkKey) != null) {
            return map.get(checkKey);
        } else {
            College master = new Master(college);
            master.loadCommonResource();
            map.put(checkKey, master);
            return master;
        }

    }
}
