package lessons9.genericAarrayKist;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Denni on 01.06.2016.
 */
public class ArrayList<E> implements Iterable<E> {
    private static final int MIN_SIZE = 10;
    private E[] list;
    private int size;

    public ArrayList() {
        list = (E[]) new Object[MIN_SIZE];
        size = 0;
    }

    public ArrayList(int maxSize) {
        list = (E[]) new Object[maxSize < MIN_SIZE ? MIN_SIZE : maxSize];
        size = 0;
    }


    public void add(E elemen) {
        if (size == list.length) {
            list = newArray(list);
            list[size++] = elemen;
        } else {
            list[size++] = elemen;
        }
    }


    public void add(int idx, E element) {
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


    public E set(int idx, E element) {
        E old = null;
        if (checkIndex(idx)) {
            old = list[idx];
            list[idx] = element;
        }

        return old;
    }


    public E get(int idx) {
        if (checkIndex(idx)) {
            return list[idx];
        }
        return null;
    }


    public E remove(int idx) {
        if (checkIndex(idx)) {
            E old = list[idx];
            shiftLeft(idx);
//            size--;
            return old;
        }
        return null;
    }


    public int indexOf(E element) {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                if (list[i] == element) {
                    return i;
                }
            }
        }
        throw new NoSuchElementException();
    }


    public int lastIndexOf(E element) {
        if (!isEmpty()) {
            for (int i = size; i >= 0; i--) {
                if (list[i] == element) {
                    return i;
                }
            }
        }
        throw new NoSuchElementException();
    }


    public Integer size() {
        return size;
    }


    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }


    public boolean contains(E element) {
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

    private E[] newArray(E[] array) {
        E[] newArray = (E[]) new Object[((array.length * 3) / 2) + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);// источник, индекс кстарого масиву, з якого ми починаєм копірувати масив, в який масив ми
        return newArray;                                    // ложим, индекс в новому масиві куда ми ложим, довжина начального масиву
    }

    private void shiftRight(int idx) {
        System.arraycopy(list, idx, list, idx + 1, size);
    }

    private void shiftLeft(int idx) {
        if (idx < size - 1) {
            System.arraycopy(list, idx + 1, list, idx, size);
        } else if (idx == size - 1) {
            list[idx] = null;
        }
        size -= 1;
    }


    @Override
    public Iterator<E> iterator() {
        return new ArrayListIterator<E>();
    }

    private class ArrayListIterator<E> implements Iterator<E> {

        private int current;

        @Override
        public boolean hasNext() {
            if (current < size) {
                return true;
            }
            return false;
        }

        @Override
        public E next() {
            return (E) list[++current];
        }

        @Override
        public void remove() {
           shiftLeft(--current);
        }
    }

}
