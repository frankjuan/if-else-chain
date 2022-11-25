package branch.supplier;

import java.util.List;

/**
 * ${description}
 *
 * @name: ItemContainer
 * @author: Y.J.
 * @date: 2022-11-25 17:11
 **/
public class ItemContainer<T> {
    private List<SupplierItem<T>> elsItems;

    public ItemContainer(List<SupplierItem<T>> elsItems) {
        this.elsItems = elsItems;
    }

    protected List<SupplierItem<T>> getElsItems() {
        return elsItems;
    }

    protected void setElsItems(List<SupplierItem<T>> elsItems) {
        this.elsItems = elsItems;
    }
}
