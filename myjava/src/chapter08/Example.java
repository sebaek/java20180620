package chapter08;

public class Example {
    public static void main(String[] args) {
        ImplementationC impl = new ImplementationC();
        
        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();
        
        InterfaceB ib = impl;
        ib.methodB();
        System.out.println();
        
        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
        System.out.println();
    }
}
