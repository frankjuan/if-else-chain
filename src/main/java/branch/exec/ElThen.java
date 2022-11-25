package branch.exec;

import java.util.List;

/**
 * ${description}
 *
 * @name: Elthen
 * @author: Y.J.
 * @date: 2022-11-25 15:22
 **/
public class ElThen extends ItemContainer {
    public ElThen(List<Item> ifItems, List<Item> elsItems) {
        super(ifItems, elsItems);
    }

    public Elf then(ExecFunction voidFunction) {
        List<Item> elfItems = this.getElsItems();
        if (null != elfItems && elfItems.size() > 0) {
            Item elsItem = elfItems.get(elfItems.size() - 1);
            elsItem.setExec(voidFunction);
        }
        return new Elf(this.getIfItems(), elfItems);
    }
}
