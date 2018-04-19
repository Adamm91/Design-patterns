package chain;

public class Police implements ChainItems {
    public boolean isMyResponsibility(String value) {
        return value.contains("kill");
    }

    public void action() {
        System.out.println("police");
    }
}
