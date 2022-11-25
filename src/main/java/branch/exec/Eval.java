package branch.exec;

import java.util.List;

/**
 * ${description}
 *
 * @name: Last
 * @author: Y.J.
 * @date: 2022-11-25 15:09
 **/
public class Eval extends ItemContainer {
    public Eval(List<Item> ifItems, List<Item> elsItems) {
        super(ifItems, elsItems);
    }

    public void exec() {
        List<Item> ifItems = this.getIfItems();
        if (ifItems.size() > 0) {
            for (Item item : ifItems) {
                if (item.isCondition() && null != item.getExec()) {
                    item.getExec().exec();
                }
            }
        }
        List<Item> elsItems = this.getElsItems();
        if ((elsItems.size() > 0) && (ifItems.size() == 0) || (ifItems.size() > 0) && !ifItems.get(ifItems.size() - 1).isCondition()) {
            for (Item item : elsItems) {
                if (item.isCondition() && null != item.getExec()) {
                    item.getExec().exec();
                    return;
                }
            }
        }
    }
}
