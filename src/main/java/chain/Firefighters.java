package chain;

public class Firefighters implements ChainItems {
    public boolean isMyResponsibility(String value) {
        return value.contains("fire");
    }

    public void action() {
        System.out.println("firefighters");
    }
}
