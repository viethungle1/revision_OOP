package collectionFramework.list;

import java.util.Arrays;

public class ArrayL<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

//    Tạo lớp ArrayList
    public ArrayL() {
        elements = new Object[DEFAULT_CAPACITY];
    }
//    Tự động nhân đôi kích thước của mảng
    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }

    public void add(int index, E e) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity();
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = e;
        size++;
    }


    public E get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        return (E) elements[i];
    }

    public static void main(String[] args) {
        ArrayL<Integer> arrayL = new ArrayL<Integer>();
        arrayL.add(8);
        arrayL.add(2);
        arrayL.add(3);
        arrayL.add(6);
        arrayL.add(1);
        arrayL.add(4,99);

        System.out.println("elements: " + arrayL.get(2));

    }

}
