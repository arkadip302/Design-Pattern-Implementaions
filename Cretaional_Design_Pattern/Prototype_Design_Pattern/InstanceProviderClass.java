package Cretaional_Design_Pattern.Prototype_Design_Pattern;

import Cretaional_Design_Pattern.Abstract_Design_Pattern.Engineer;

public class InstanceProviderClass {

    private InstanceProviderClass() {

    }

    static Engineer provideInstance() {
        return new Engineer();
    }
}
