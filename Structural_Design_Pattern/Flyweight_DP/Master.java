package Structural_Design_Pattern.Flyweight_DP;

public class Master implements College {
    String collegeName = null;
    String degreeName = "Post Graduate";
    Integer years = 2;

    public Master(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public void loadCommonResource() {
        System.out.println("Is CS Available : " + CommonSharableResource.isCSAvailable);
        System.out.println("Is Gate Rank Required : " + CommonSharableResource.isGateRankRequired);
        System.out.println("Minimum Gate Rank : " + CommonSharableResource.minGateRank);
        System.out.println("Number Of Branch : " + CommonSharableResource.numberOfBranch);
        System.out.println("Degree Name: " + degreeName);
        System.out.println("Number Of years : " + years);

    }

}
