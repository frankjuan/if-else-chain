package branch.supplier;


import java.util.List;

/**
 * ${description}
 *
 * @name: Last
 * @author: Y.J.
 * @date: 2022-11-25 15:09
 **/
public class SupplierEval<T> extends ItemContainer<T> {
    public SupplierEval(List<SupplierItem<T>> elsItems) {
        super(elsItems);
    }

    public T eval() {
        List<SupplierItem<T>> elsItems = this.getElsItems();
        if (elsItems.size() > 0) {
            for (SupplierItem<T> item : elsItems) {
                if (item.isCondition() && null != item.getSupplier()) {
                    return item.getSupplier().get();
                }
            }
        }
        return null;
    }
}
