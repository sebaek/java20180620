package chapter07;

public class Student extends People {
    private int studentNo;
    
    public Student(String name, String ssn, int studentNo) {
        super(name, ssn);
        this.studentNo = studentNo;
    }
    
    @Override
    public String getName() {
        System.out.println("name 읽는 중");
        return super.getName();
    }

    public int getStudentNo() {
        System.out.println("studentNo 읽는 중");
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }
    
    
}
