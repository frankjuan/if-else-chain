package branch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * ${description}
 *
 * @name: BranchUtilsTest
 * @author: Y.J.
 * @date: 2022-11-25 19:29
 **/
class BranchUtilsTest {

    @Test
    void br() {
        BranchUtils.br()
                .ef(true)
                .then(() -> {
                    System.out.println("xxx");
                })
                .ef(true)
                .then(() -> System.out.println("okok"))
                .els(() -> System.out.println("yyy"))
                .exec();
    }

    @Test
    public void br1() {
        BranchUtils.br().ef(2 < 1)
                .then(() -> System.out.println("Whats up"))
                .els(() -> System.out.println("I am els")).exec();
    }

    @Test
    void br2() {
        String resultStringx =
                BranchUtils.br(String.class)
                        .ef(true)
                        .then(() -> "string")
                        .elf(false)
                        .then(String::new)
                        .elf(false)
                        .then(String::new)
                        .els(() -> "last")
                        .eval();
        Assertions.assertTrue(resultStringx.equals("string"));
    }

    @Test
    public void br4() {
        BranchUtils.br().exec();
        BranchUtils.br().elf(true).then(() -> System.out.println("aaa")).exec();
        BranchUtils.br().els(() -> System.out.println("aaa")).exec();
        BranchUtils.br().elf(false).then(()-> System.out.println("haha"))
                .elf(true).then(()-> System.out.println("wowo")).exec();
        BranchUtils.br().ef(false).then(null)
                .elf(true).then(null).exec();
    }
}