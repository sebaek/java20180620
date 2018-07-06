package chapter14.section0601;

public class Member {
    private String name;
    private String id;
    
    public Member() {
        System.out.println("Member() 실행");
    }
    
    public Member(String id) {
        System.out.println("Memeber(String id) 실행");
        this.id = id;
    }
    
    public Member(String name, String id) {
        System.out.println("Memeber(String name, String id) 실행");
        this.id = id;
        this.name = name;
    }
    
}
