package homework_2.Fabric;

import homework_2.Interface.iGameItem;

public abstract class ItemGenerator {
    public abstract iGameItem createItem();
    
    public void openReward() {
        createItem().open();
    }
}
