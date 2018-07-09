package chapter09.section0203;

public class A {
    A() {
        System.out.println("A 객체가 생성됨");
    }

    class B {
        B() {
            System.out.println("B 객체가 생성됨");
        }

        int field1;

        void method1() {
        }

//         static int field2;
//         static void method2() {
//        
//         }
    }

    static class C {
        C() {
            System.out.println("C 객체가 생성된");
        }

        int field1;
        static int field2;

        void method1() {
        }

        static void method2() {
        }
    }

    void method() {
        class D {
            D() {
                System.out.println("D 객체가 생성됨");
            }

            int field1;
            void method1() {
            }

            // static int field2;
            // static void method2() {
            // }
        }
        D d = new D();
        d.field1 = 3;
        d.method1();
    }
}
