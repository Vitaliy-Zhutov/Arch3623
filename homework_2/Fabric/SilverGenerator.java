package homework_2.Fabric;

import homework_2.Interface.iGameItem;
import homework_2.Product.SilverReward;

public class SilverGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new SilverReward();
    }
    
}
