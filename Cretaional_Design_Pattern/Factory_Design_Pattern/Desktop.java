package Cretaional_Design_Pattern.Factory_Design_Pattern;

public class Desktop implements Computer {

    @Override
    public String proccessorAvaialble() {
        return "Intel i9";
    }

    @Override
    public Integer core() {
        return 8;
    }

    @Override
    public String ssd() {
        return "1TB";
    }

    @Override
    public String hdd() {
        return "2TB";
    }

}
