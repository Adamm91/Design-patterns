package chain;

public class Default implements ChainItems{

    public boolean isMyResponsibility(String value) {
        return !value.contains("sick") && !value.contains("kill") && !value.contains("fire");
    }

    public void action() {
        System.out.println("default action");
    }
}
