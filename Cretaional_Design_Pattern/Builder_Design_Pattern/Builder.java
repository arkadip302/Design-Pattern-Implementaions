package Cretaional_Design_Pattern.Builder_Design_Pattern;

public interface Builder {

    void ramDetails();

    void gpuDetails();

    void getCore();

    void getScreenSize();

    Laptop buildObject();

}
