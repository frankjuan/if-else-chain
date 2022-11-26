package branch.exec;

import java.util.List;

/**
 * ${description}
 *
 * @name: Elf
 * @author: Y.J.
 * @date: 2022-11-25 15:20
 **/
public class Elf extends Eval {

    public Elf(List<Item> ifItems, List<Item> elsItems) {
        super(ifItems, elsItems);
    }

    public ElThen elf(boolean condition) {
        Item elsItem = new Item(condition);
        this.getElsItems().add(elsItem);
        ElThen tlThen = new ElThen(this.getIfItems(), this.getElsItems());
        return tlThen;
    }

    public Eval els(ExecFunction exec) {
        Item elsItem = new Item(true, exec);
        this.getElsItems().add(elsItem);
        return new Eval(this.getIfItems(), this.getElsItems());
    }
}
