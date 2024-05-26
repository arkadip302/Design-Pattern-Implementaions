package Cretaional_Design_Pattern.Factory_Design_Pattern;

public class Asus360 implements Laptop {

    @Override
    public String proccessorAvaialble() {
        return "Intel i7 2nd Gen";
    }

    @Override
    public Integer core() {
        return 8;
    }

    @Override
    public String ssd() {
        return "1 TB";
    }

    @Override
    public String hdd() {
        return "2 TB";
    }

    @Override
    public Double getScreenSize() {
        return Double.parseDouble("13.33");
    }

}
