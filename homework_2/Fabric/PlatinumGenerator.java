package homework_2.Fabric;

import homework_2.Interface.iGameItem;
import homework_2.Product.PlatinumReward;

public class PlatinumGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new PlatinumReward();
    }
    
}
