package branch.supplier;

import java.util.List;
import java.util.function.Supplier;

/**
 * ${description}
 *
 * @name: Elthen
 * @author: Y.J.
 * @date: 2022-11-25 15:22
 **/
public class SupplierElThen<T> extends ItemContainer<T> {
    public SupplierElThen(List<SupplierItem<T>> elsItems) {
        super(elsItems);
    }

    public SupplierElf<T> then(Supplier<T> supplier) {
        List<SupplierItem<T>> elsItems = this.getElsItems();
        if (null != elsItems && elsItems.size() > 0) {
            SupplierItem<T> elsItem = elsItems.get(elsItems.size() - 1);
            elsItem.setSupplier(supplier);
        }
        return new SupplierElf(elsItems);
    }
}
