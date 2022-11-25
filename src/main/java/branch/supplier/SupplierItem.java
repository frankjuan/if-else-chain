package branch.supplier;

import java.util.function.Supplier;

/**
 * ${description}
 *
 * @name: CalcItem
 * @author: Y.J.
 * @date: 2022-11-25 13:59
 **/
public class SupplierItem<T> {
    private boolean condition;
    private Supplier<T> supplier;

    public SupplierItem(boolean condition) {
        this.condition = condition;
    }

    public SupplierItem(boolean condition, Supplier<T> supplier) {
        this.condition = condition;
        this.supplier = supplier;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public Supplier<T> getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier<T> supplier) {
        this.supplier = supplier;
    }
}
