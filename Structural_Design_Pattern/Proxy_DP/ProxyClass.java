package Structural_Design_Pattern.Proxy_DP;

/**
 * ProxyClass
 */
public class ProxyClass extends MainClass {

    @Override
    public void methodToCall(String str) {
        System.out.println("First Proxy Object Will Verify, Then We Go For Actual Class Implementation ");
        if (str.equalsIgnoreCase("Pass")) {

            super.methodToCall(str);

        } else {
            throw new NullPointerException("Does Not Have Proper Access");
        }
    }
}