package chapter07;

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("홍길동", "123456-1234567", 1);
        System.out.println("name: " + student.getName());
        System.out.println("ssn : " + student.getSsn());
        System.out.println("studentNo : " + student.getStudentNo());
                
    }
}
