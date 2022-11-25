package branch.exec;

import java.util.List;

/**
 * ${description}
 *
 * @name: Then
 * @author: Y.J.
 * @date: 2022-11-25 17:29
 **/
public class Then extends ItemContainer{
    public Then(List<Item> ifItems, List<Item> elsItems) {
        super(ifItems, elsItems);
    }

    public Ef then(ExecFunction exec) {
        List<Item> ifItems = this.getIfItems();
        if (null != ifItems && ifItems.size() > 0) {
            Item ifItem = ifItems.get(ifItems.size()-1);
            ifItem.setExec(exec);
        }
        return new Ef(ifItems, this.getElsItems());
    }
}
