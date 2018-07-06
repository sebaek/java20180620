package chapter14.section0601;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferencesExample {
    public static void main(String[] args) {
        Supplier<Member> supplier = Member::new;
        Member member0 = supplier.get();
        
        Function<String, Member> function1 = Member::new;
        Member member1 = function1.apply("angel");
        
        BiFunction<String, String, Member> function2 = Member::new;
        Member member2 = function2.apply("신천사", "angel");
    }
}
