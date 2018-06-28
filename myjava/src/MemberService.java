
public class MemberService {

    public boolean login(String id, String password) {
        if (id.equals("hong") && password.equals("12345")) {
            return true;
        }
            
        return false;
    }

    public void logout(String string) {
        System.out.println("로그아웃 되었습니다.");
    }
    
}
