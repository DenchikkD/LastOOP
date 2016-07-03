package collections.list;

import java.util.NoSuchElementException;

/**
 * Created by Denni on 01.06.2016.
 */
public class ArrayList implements List {

    private int[] list;
    private int size;

    public ArrayList() {
        list = new int[10];
        size = 0;
    }

    public ArrayList(int maxSize) {
        list = new int[maxSize];
        size = 0;
    }

    @Override
    public void add(int elemen) {
        if (size == list.length) {
            list = newArray(list);
            list[size++] = elemen;
        } else {
            list[size++] = elemen;
        }
    }

    @Override
    public void add(int idx, int element) {
        if (checkIndex(idx)) {
            if (size == list.length) {
                list = newArray(list);
                shiftRight(idx);
            }
            shiftRight(idx);
            list[idx] = element;
            size++;


        }
    }

    @Override
    public int set(int idx, int element) {
        int old = 0;
        if (checkIndex(idx)) {
            old = list[idx];
            list[idx] = element;
        }

        return old;
    }

    @Override
    public int get(int idx) {
        if (checkIndex(idx)) {
            return list[idx];
        }
        return 0;
    }

    @Override
    public int remove(int idx) {
        if (checkIndex(idx)) {
            int old = list[idx];
            shiftLeft(idx);
            size--;
            return old;
        }
        return 0;
    }

    @Override
    public int indexOf(int element) {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                if (list[i] == element) {
                    return i;
                }
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public int lastIndexOf(int element) {
        if (!isEmpty()) {
            for (int i = size; i >= 0; i--) {
                if (list[i] == element) {
                    return i;
                }
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public Integer size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(int element) {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                if (list[i] == element) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkIndex(int idx) {
        if (idx > size || idx < 0) {
            throw new IndexOutOfBoundsException();
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            if (i < size - 1) {
                System.out.print(list[i] + ",");
            } else {
                System.out.print(list[i]);
            }
        }
        System.out.println("]");
        return builder.toString();
    }

    private int[] newArray(int[] array) {
        int[] newArray = new int[((array.length * 3) / 2) + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);// источник, индекс кстарого масиву, з якого ми починаєм копірувати масив, в який масив ми
        return newArray;                                    // ложим, индекс в новому масиві куда ми ложим, довжина начального масиву
    }

    private void shiftRight(int idx) {
        System.arraycopy(list, idx, list, idx + 1, size);
    }

    private void shiftLeft(int idx) {
        System.arraycopy(list, idx + 1, list, idx, size);
    }
}
