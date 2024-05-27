package Cretaional_Design_Pattern.Builder_Design_Pattern;

//Concrete Builder
public class OfficeLaptop implements Builder {

    private Laptop officeLaptop = new Laptop();

    @Override
    public void ramDetails() {
        this.officeLaptop.ramDetails = "16BG";
    }

    @Override
    public void gpuDetails() {
        this.officeLaptop.gpuDetails = null;
    }

    @Override
    public void getCore() {
        this.officeLaptop.core = 8;
    }

    @Override
    public void getScreenSize() {
        this.officeLaptop.screenSize = Double.parseDouble("13.32");
    }

    @Override
    public Laptop buildObject() {
        return this.officeLaptop;
    }

}
