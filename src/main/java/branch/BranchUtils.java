package branch;


import branch.exec.Ef;
import branch.supplier.SupplierEf;

import java.util.ArrayList;

/**
 * ${description}
 *
 * @name: BranUtil
 * @author: Y.J.
 * @date: 2022-11-25 13:26
 **/
public class BranchUtils {
    public static <T> SupplierEf<T> br(Class<T> clazz) {
        return new SupplierEf<>(new ArrayList<>());
    }

    public static Ef br() {
        return new Ef(new ArrayList<>(), new ArrayList<>());
    }
}
