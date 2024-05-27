package Structural_Design_Pattern.Proxy_DP;

public class ClientClass {
    public static void main(String[] args) {
        ProxyClass proxyClass = new ProxyClass();
        proxyClass.methodToCall("Pass");
    }
}
