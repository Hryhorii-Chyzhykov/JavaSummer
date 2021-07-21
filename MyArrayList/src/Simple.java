public interface Simple<E> extends Iterable<E>{
    boolean add(E e);
    void del(int index);
    E get (int index);
    int size();
    boolean set (int index, E e);
}
