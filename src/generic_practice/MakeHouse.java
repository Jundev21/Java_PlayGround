package generic_practice;

public class MakeHouse<T extends OtherFrame> {

    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "generic func";
    }
}
