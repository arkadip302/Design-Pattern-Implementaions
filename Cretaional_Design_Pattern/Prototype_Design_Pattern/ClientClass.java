package Cretaional_Design_Pattern.Prototype_Design_Pattern;

import Cretaional_Design_Pattern.Abstract_Design_Pattern.Engineer;

public class ClientClass {
    public static void main(String[] args) {
        Engineer engineer1Instance = InstanceProviderClass.provideInstance();
        Engineer engineer3Instance = InstanceProviderClass.provideInstance();
        System.out.println("---------------------------------------------------------------------------");
        if (engineer1Instance != engineer3Instance) {
            System.out.println(
                    "Will not have same object, as we are asking a Instance Provide For Creating An Instance And Every Time Its Returning A New Instance");
        }
        System.out.println("---------------------------------------------------------------------------");
    }
}
