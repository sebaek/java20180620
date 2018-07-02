package chapter07.section08;

public class PhoneBroker {

    public static Phone getInstance(String string) {

        if (string.equals("galaxy")) {
            return new GalaxyPhone();
        } else if (string.equals("xaomi")) {
            return new XaomiPhone();
        }
        return null;
    }
    
}
