package branch.supplier;

import java.util.List;

/**
 * ${description}
 *
 * @name: SupplierEf
 * @author: Y.J.
 * @date: 2022-11-25 16:36
 **/
public class SupplierEf<T> extends SupplierElf<T> {
    public SupplierEf(List<SupplierItem<T>> elsItems) {
        super(elsItems);
    }

    public SupplierElThen<T> ef(boolean condition) {
        return super.elf(condition);
    }

}
