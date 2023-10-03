package homework_2.Fabric;

import homework_2.Interface.iGameItem;
import homework_2.Product.PlasticReward;

public class PlasticGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new PlasticReward();
    }
    
}
