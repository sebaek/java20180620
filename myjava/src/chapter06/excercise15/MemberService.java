package chapter06.excercise15;

public class MemberService {

    public boolean login(String id, String password) {
        
        return id.equals("hong") && password.equals("12345");
    }

    public void logout(String id) {
        System.out.println("로그아웃되었습니다.");
    }

}
