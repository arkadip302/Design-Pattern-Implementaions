package Structural_Design_Pattern.Proxy_DP;

public class ClientClass {
    public static void main(String[] args) {
        MainMethod proxyClass = new ProxyClass();
        proxyClass.methodToCall("Pass");
    }
}
