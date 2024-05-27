package Cretaional_Design_Pattern.Builder_Design_Pattern;

public class Director {

    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Laptop buildObjectToReturn() {
        return builder.buildObject();
    }

    public void createInstance() {
        this.builder.getScreenSize();
        this.builder.ramDetails();
        this.builder.getCore();
        this.builder.gpuDetails();
    }

}
