package homework_2.Fabric;

import homework_2.Interface.iGameItem;
import homework_2.Product.GoldReward;

public class GoldGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new GoldReward();
    }
    
}
