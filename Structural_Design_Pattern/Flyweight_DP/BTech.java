package Structural_Design_Pattern.Flyweight_DP;

public class BTech implements College {
    String collegeName = null;
    String degreeName = "Under Graduate";
    Integer years = 4;

    public BTech(String collegeName) {
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
