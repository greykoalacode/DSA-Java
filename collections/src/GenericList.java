import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {

    private T[] items;
    private int size;

    public GenericList() {
        this.items = (T[]) new Object[100];
        this.size = 0;
    }

    public void add(T item) {
        items[size++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new GenericListIterator(this);
    }

    private class GenericListIterator implements Iterator<T> {

        private GenericList<T> list;
        private int index = 0;

        public GenericListIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index < list.size;
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
