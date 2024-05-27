package Structural_Design_Pattern.Flyweight_DP;

public interface ClientClass {
    public static void main(String[] args) {
        CollegeFactory collegeFactory = new CollegeFactory();
        College college1 = collegeFactory.getCollegeDetailsForBtech("KIIT");
        College college2 = collegeFactory.getCollegeDetailsForBtech("VIT");
        College college3 = collegeFactory.getCollegeDetailsForMasters("VIT");
        College college4 = collegeFactory.getCollegeDetailsForBtech("KIIT");
        System.out.println(college1.hashCode());
        System.out.println(college4.hashCode());
        System.out.println(college2.hashCode());
        System.out.println(college3.hashCode());
    }
}
