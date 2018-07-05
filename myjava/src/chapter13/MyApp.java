package chapter13;

public class MyApp {
    public static void main(String[] args) {
        UserList userList = new UserList();
        userList.add(new User("지수", "서울"));
        userList.add(new User("로제", "부산"));
        userList.add(new User("리사", "미국"));
        userList.add(new User("제니", "호주"));
        
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i).getName());
            System.out.println(userList.get(i).getAddress());
        }
        
        ProductList productList = new ProductList();
        productList.add(new Product("지우개", 500));
        productList.add(new Product("음료수", 1000));
        productList.add(new Product("핸드폰", 800));
        productList.add(new Product("모니터", 300));
        
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i).getName());
            System.out.println(productList.get(i).getPrice());
        }
    }
}
