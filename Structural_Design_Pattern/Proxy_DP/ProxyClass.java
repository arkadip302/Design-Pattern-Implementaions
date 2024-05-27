package Structural_Design_Pattern.Proxy_DP;

/**
 * ProxyClass
 */
public class ProxyClass extends MainClass {

    @Override
    void methodToCall(String str) {
        if (str.equalsIgnoreCase("Pass")) {
            super.methodToCall(str);
        } else {
            throw new NullPointerException("Does Not Have Proper Access");
        }
    }
}