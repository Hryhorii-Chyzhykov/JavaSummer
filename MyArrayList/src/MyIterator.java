import java.util.Iterator;

public class MyIterator<E> implements Iterator {
    private E[] values;
    private int index;

    public MyIterator(E[] values) {this.values = values;}

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public Object next() {
        return values[index++];
    }
}
