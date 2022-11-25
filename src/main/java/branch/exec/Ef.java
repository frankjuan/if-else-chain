package branch.exec;

import java.util.List;

/**
 * ${description}
 *
 * @name: SupplierEf
 * @author: Y.J.
 * @date: 2022-11-25 16:36
 **/
public class Ef extends Elf {
    public Ef(List<Item> ifItems, List<Item> elsItems) {
        super(ifItems, elsItems);
    }

    public Then ef(boolean condition) {
        Item ifItem = new Item(condition);
        this.getIfItems().add(ifItem);
        Then then = new Then(this.getIfItems(), this.getElsItems());
        return then;
    }

}
