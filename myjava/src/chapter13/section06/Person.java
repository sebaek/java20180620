package chapter13.section06;

public class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public String toString() {
        return this.name;
    }
}
class Worker extends Person {
    Worker(String name) {
        super(name);
    }
}
class Student extends Person {
    Student(String name) {
        super(name);
    }
}
class HighStudent extends Student {
    HighStudent(String name) {
        super(name);
    }
}
