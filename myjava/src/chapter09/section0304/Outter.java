package chapter09.section0304;

public class Outter {
    String field = "Outter-field";
    void method() {
        System.out.println("Outter-method");
    }
    class Nested {
        String field = "Nested-field";
        void method() {
            System.out.println("Nested-method");
        }
        
        void print() {
            String field = "Local-variable";
            System.out.println(field);
            
            System.out.println(this.field);
            this.method();
            
            System.out.println(Outter.this.field);
            Outter.this.method();
        }
    }
}
