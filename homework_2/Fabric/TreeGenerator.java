package homework_2.Fabric;

import homework_2.Interface.iGameItem;
import homework_2.Product.TreeReward;

public class TreeGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new TreeReward();
    }
    
}
