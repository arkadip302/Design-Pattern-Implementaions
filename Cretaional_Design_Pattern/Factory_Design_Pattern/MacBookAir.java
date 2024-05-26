package Cretaional_Design_Pattern.Factory_Design_Pattern;

public class MacBookAir implements Laptop {

    @Override
    public String proccessorAvaialble() {
        return "M2 ChipSet";
    }

    @Override
    public Integer core() {
        return 4;
    }

    @Override
    public String ssd() {
        return "512GB";
    }

    @Override
    public String hdd() {
        return null;
    }

    @Override
    public Double getScreenSize() {
        throw new UnsupportedOperationException("Unimplemented method 'getScreenSize'");
    }

}
