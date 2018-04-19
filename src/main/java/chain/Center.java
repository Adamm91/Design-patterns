package chain;

import java.util.ArrayList;
import java.util.List;

public class Center {

    private List<ChainItems> chainItems;

    public Center() {
        this.chainItems = new ArrayList<ChainItems>();
        this.chainItems.add(new Emergency());
        this.chainItems.add(new Firefighters());
        this.chainItems.add(new Police());
        this.chainItems.add(new Default());
    }

    public void emergency(String value) {
        for (ChainItems chainItem : chainItems) {
            if (chainItem.isMyResponsibility(value)) {
                chainItem.action();
            }
        }
    }

}
