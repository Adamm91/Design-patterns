package singleton;

public class Shop {

    private static Shop instance;

    public static Shop instanceOf () {
        if (instance == null) {
            instance = new Shop();
        }
        return instance;
    }

    private Shop() {
    }
}
