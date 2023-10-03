package homework_2.Fabric;

import homework_2.Interface.iGameItem;
import homework_2.Product.GemReward;

public class GemGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new GemReward();
    }
    
}

