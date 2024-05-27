package Cretaional_Design_Pattern.Singleton_Design_Pattern;

import Cretaional_Design_Pattern.Abstract_Design_Pattern.Engineer;

public class ClientCass {
    public static void main(String[] args) {
        Engineer engineer1Instance = InstanceProviderClass.provideInstance();
        Engineer engineer2Instance = InstanceProviderClass.provideInstance();
        Engineer engineer3Instance = new Engineer();
        System.out.println("---------------------------------------------------------------------------");
        if (engineer1Instance == engineer2Instance) {
            System.out.println(
                    "Shoud have same object, as we are asking a Instance Provide EveryTime For Creating An Instance");
        } else {
            System.out.println("Code Failed");
        }
        System.out.println("---------------------------------------------------------------------------");
        if (engineer1Instance != engineer3Instance) {
            System.out.println(
                    "May or May not have same object, as we are asking a Instance Provide For Creating An Instance and Another One We Are Using NEW Keyword");
        }
        System.out.println("---------------------------------------------------------------------------");
    }
}
