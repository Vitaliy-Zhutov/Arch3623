package homework_2.Fabric;

import homework_2.Interface.iGameItem;
import homework_2.Product.PaperReward;

public class PaperGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new PaperReward();
    }
    
}
