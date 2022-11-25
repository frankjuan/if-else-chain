package branch.supplier;

import java.util.List;
import java.util.function.Supplier;

/**
 * ${description}
 *
 * @name: Elf
 * @author: Y.J.
 * @date: 2022-11-25 15:20
 **/
public class SupplierElf<T> extends SupplierEval<T> {

    public SupplierElf(List<SupplierItem<T>> elsItems) {
        super(elsItems);
    }

    public SupplierElThen<T> elf(boolean condition) {
        SupplierItem<T> ifItem = new SupplierItem<>(condition);
        this.getElsItems().add(ifItem);
        SupplierElThen<T> tlThen = new SupplierElThen<>(this.getElsItems());
        return tlThen;
    }

    public SupplierEval<T> els(Supplier<T> supplier) {
        SupplierItem<T> elsItem = new SupplierItem<>(true, supplier);
        this.getElsItems().add(elsItem);
        return new SupplierEval(this.getElsItems());
    }
}
