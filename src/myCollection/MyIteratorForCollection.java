package myCollection;

import java.util.Iterator;

public class MyIteratorForCollection implements Iterator {
    private Object[] data;
    private int index;

    public MyIteratorForCollection(Object[] objects) {
        this.data = objects;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < data.length;
    }

    @Override
    public Object next() {
        Object result = data[index];
        index++;
        return result;
    }
}
