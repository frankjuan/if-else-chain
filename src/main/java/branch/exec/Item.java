package branch.exec;

/**
 * ${description}
 *
 * @name: CalcItem
 * @author: Y.J.
 * @date: 2022-11-25 13:59
 **/
public class Item {
    private boolean condition;
    private ExecFunction exec;

    public Item(Boolean condition) {
        this.condition = condition;
    }

    public Item(Boolean condition, ExecFunction execFunction) {
        this.condition = condition;
        this.exec = execFunction;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public ExecFunction getExec() {
        return exec;
    }

    public void setExec(ExecFunction exec) {
        this.exec = exec;
    }
}
