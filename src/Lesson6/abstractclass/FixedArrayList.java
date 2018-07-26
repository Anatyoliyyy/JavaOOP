package Lesson6.abstractclass;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

public class FixedArrayList extends AbstractList implements List {

    private Object[] objects;

    public FixedArrayList(int size) {
        this.objects = new Object[size];
    }

    @Override
    public Object get(int index) {
        return objects[index];
    }

    @Override
    public Object set(int index, Object element) {
        Object prev = objects[index];
        objects[index] = element;
        return prev;
    }

    @Override
    public int size() {
        return objects.length;
    }
}