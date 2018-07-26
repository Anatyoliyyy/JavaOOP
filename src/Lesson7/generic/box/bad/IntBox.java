package Lesson7.generic.box.bad;

public class IntBox {

    private final int value;

    public IntBox(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    @Override
    public String toString() {
        return "IntBox{" +
                "value=" + value +
                '}';
    }
}