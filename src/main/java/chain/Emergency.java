package chain;

public class Emergency implements ChainItems {
    public boolean isMyResponsibility(String value) {
        return value.contains("sick");
    }

    public void action() {
        System.out.println("emergency");
    }
}
