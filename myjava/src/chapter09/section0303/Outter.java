package chapter09.section0303;

public class Outter {
    public void method1(final int arg) {
        final int localVariable = 1;
        
        class Inner {
            public void method() {
                int result = arg + localVariable;
//                arg = 3;
//                localVariable = 2;
            }
        }
        
    }
    
    public void method2(int arg) {
        int localVariable = 1;
        
        class Inner {
            public void method() {
                int result = arg + localVariable;
            }
        }
//        localVariable = 3;
    }
}
