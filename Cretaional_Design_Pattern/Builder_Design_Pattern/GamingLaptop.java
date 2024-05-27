package Cretaional_Design_Pattern.Builder_Design_Pattern;

//Concrete Builder
public class GamingLaptop implements Builder {

    private Laptop gamingLaptop = new Laptop();

    @Override
    public void ramDetails() {
        this.gamingLaptop.ramDetails = "32BG";
    }

    @Override
    public void gpuDetails() {
        this.gamingLaptop.gpuDetails = "NVEDIA";
    }

    @Override
    public void getCore() {
        this.gamingLaptop.core = 16;
    }

    @Override
    public void getScreenSize() {
        this.gamingLaptop.screenSize = Double.parseDouble("17.02");
    }

    @Override
    public Laptop buildObject() {
        return this.gamingLaptop;
    }

}
