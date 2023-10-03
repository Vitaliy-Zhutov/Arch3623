package homework_2.Fabric;

import homework_2.Interface.iGameItem;
import homework_2.Product.CopperReward;

public class CopperGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new CopperReward();
    }
    
}
