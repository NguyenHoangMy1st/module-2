package ss11_stack_queue.demo;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyArrayList<E> extends MyAbstractList<E> {
    public static final int INITIAL_CAPACITY = 16;
    private E[] data = (E[]) new Object[INITIAL_CAPACITY];

    /**
     * Create a default list
     */
    public MyArrayList() {
    }

    /**
     * Create a list from an array of objects
     */
    public MyArrayList(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            add(objects[i]); // Warning: don't use super(objects)!
    }

    @Override
    public void add(int index, E e) {
        ensureCapacity();

        // Move the elements to the right after the specified index
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        // Insert new element to data[index]
        data[index] = e;

        // Increase size by 1
        size++;
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    @Override
    public void clear() {
        // Implementation for clearing the list
    }

    @Override
    public boolean contains(Object o) {
        return false; // Placeholder implementation
    }

    @Override
    public E get(int index) {
        return null; // Placeholder implementation
    }

    @Override
    public int lastIndexOf(E e) {
        return 0;
    }

    @Override
    public int indexOf(Object o) {
        return -1; // Placeholder implementation
    }

    @Override
    public E remove(int index) {
        checkIndex(index);

        E element = data[index];

        // Shift data to the left
        for (int j = index; j < size - 1; j++) {
            data[j] = data[j + 1];
        }

        data[size - 1] = null; // This element is now NULL

        // Decrement size
        size--;

        return element;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        }
    }

    @Override
    public Object set(int index, Object o) {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        super.forEach(action);
    }

    @Override
    public Spliterator<E> spliterator() {
        return super.spliterator();
    }
}