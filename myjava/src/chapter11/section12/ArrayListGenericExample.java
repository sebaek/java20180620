package chapter11.section12;

import java.util.ArrayList;

class User {
    private String name;
    private String address;
    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
}

public class ArrayListGenericExample {
    public static void main(String[] args) {
        ArrayList userlist = new ArrayList();
//        userlist.add("제니, 미국");
        userlist.add(new User("제니", "미국"));
        userlist.add(new User("지수", "한국"));
        
        User user1 = (User) userlist.get(0);
        Object user2 = userlist.get(1);
        
        System.out.println(user1.getName());
        System.out.println(user1.getAddress());
        
        ArrayList<User> userlist2 = new ArrayList<User>();
        userlist2.add(new User("로제", "호주"));
//        userlist2.add("로제, 호주");
        
        User user3 = userlist2.get(0);
        System.out.println(user3.getName());
        System.out.println(user3.getAddress());
        
    }
}







