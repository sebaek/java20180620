package chapter13;

public class UserList {
    private User[] list;
    private int size;
    
    public UserList() {
        list = new User[2];
        size = 0;
    }
    
    public void add(User user) {
        if (list.length == size) {
            User[] newList = new User[list.length * 2];
            for (int i = 0; i < list.length; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }
        list[size++] = user;
    }

    public int size() {
        return size;
    }

    public User get(int i) {
        return list[i];
    }

}
