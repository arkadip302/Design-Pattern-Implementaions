package Cretaional_Design_Pattern.Singleton_Design_Pattern;

import Cretaional_Design_Pattern.Abstract_Design_Pattern.Engineer;

public class InstanceProviderClass {

    private static Engineer engineerStaticInstance = new Engineer();

    private InstanceProviderClass() {

    }

    static Engineer provideInstance() {
        return engineerStaticInstance;
    }
}
