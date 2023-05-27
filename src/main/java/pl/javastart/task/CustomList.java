package pl.javastart.task;

import java.util.Arrays;

// Uzupełnij klasę. Możesz ją dowolnie modyfikować.
// Celem jest, żeby przechodziły testy w src/test/java/[...]/CustomListTest
public class CustomList<T> {
    private Object[] objects;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public CustomList() {
        this.objects = new Object[INITIAL_CAPACITY];
        this.size = 0;
    }

    public T get(int index) {
        checkIndexBounds(index);
        return (T) objects[index];
    }

    public void add(T element) {
        ensureCapacity(size + 1);
        objects[size++] = element;
    }

    public void add(int index, T element) {
        checkIndexBounds(index);
        ensureCapacity(size + 1);
        System.arraycopy(objects, index, objects, index + 1, size - index);
        objects[index] = element;
        size++;
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        checkIndexBounds(index);
        int numElements = size - index - 1;
        if (numElements > 0) {
            System.arraycopy(objects, index + 1, objects, index, numElements);
        }
        objects[--size] = null;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > objects.length) {
            int newCapacity = objects.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            objects = Arrays.copyOf(objects, newCapacity);
        }
    }

    private void checkIndexBounds(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append('[');
        for (int i = 0; i < size - 1; i++) {
            builder.append(objects[i]);
            builder.append(", ");
        }
        builder.append(objects[size - 1]);
        builder.append(']');
        return builder.toString();
    }
}