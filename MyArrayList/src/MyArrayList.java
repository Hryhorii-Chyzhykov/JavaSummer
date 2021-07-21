import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements Simple<E>{
    public static void main(String[] args) {

    }

    private E[] values;

    MyArrayList(){values = (E[]) new Object[0];}

    @Override
    public boolean add(E e){
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        }
        catch (ClassCastException ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void del(int index) {
        System.out.println("It is an array with no way to remove an element!");
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public boolean set (int index, E e) {
        try {
            values[index] = e;
            return true;
        }
        catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator<>(values);
    }


}
