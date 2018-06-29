package chapter06.excercise18;

public class ShopService {
    
    static private ShopService shopService = new ShopService();

    public static ShopService getInstance() {
        
        return shopService;
    }

}
