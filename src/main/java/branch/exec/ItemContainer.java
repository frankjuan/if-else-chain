package branch.exec;

import java.util.List;

/**
 * ${description}
 *
 * @name: Itemer
 * @author: Y.J.
 * @date: 2022-11-25 16:15
 **/
public class ItemContainer {
    private List<Item> ifItems;
    private List<Item> elsItems;

    public ItemContainer(List<Item> ifItems, List<Item> elsItems) {
        this.ifItems = ifItems;
        this.elsItems = elsItems;
    }

    protected List<Item> getIfItems() {
        return ifItems;
    }

    protected void setIfItems(List<Item> ifItems) {
        this.ifItems = ifItems;
    }

    protected List<Item> getElsItems() {
        return elsItems;
    }

    protected void setElsItems(List<Item> elsItems) {
        this.elsItems = elsItems;
    }
}
