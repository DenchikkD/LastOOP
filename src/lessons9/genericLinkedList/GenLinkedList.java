package lessons9.genericLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by Denni on 09.06.2016.
 */
public class GenLinkedList<T> implements Iterable {

    private Node head;
    private Node tail;
    private int size;

    private class Node {
        private T element;
        private Node next;

        public Node(T element) {
            this.element = element;
        }

        public T getElement() {
            return element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setElement(T element) {
            this.element = element;
        }
    }


    public GenLinkedList() {
        size = 0;
    }

    public void add(T element) {

        Node nd = new Node(element);

        if (tail != null) {
            tail.setNext(nd);
            tail = nd;
        } else {
            head = tail = nd;
        }
        size++;
    }

    public void add(int idx, T element) {
        if (checkIndex(idx)) {
            Node nd = new Node(element);
            Node position = head;
            if (idx != 0) {
                for (int i = 0; i != idx - 1; i++) {
                    System.out.println(i);
                    position = position.getNext();
                }
                nd.setNext(position.getNext());
                position.setNext(nd);
            } else {
                nd.setNext(position);
                head = nd;
            }
            size++;
        }
    }

    public T set(int idx, T element) {
        T oldValue = null;
        if (checkIndex(idx)) {
            Node nd = new Node(element);
            Node position = head;
            for (int i = 0; i < idx; i++) {
                position = position.getNext();
            }
            oldValue = position.getElement();
            position.setElement(element);
        }

        return oldValue;
    }

    public T get(int idx) {
        if (checkIndex(idx)) {
            Node position = head;
            for (int i = 0; i < idx; i++) {
                position = position.getNext();
            }
            return position.getElement();
        }
        throw new NoSuchElementException();
    }

    public T remove(int idx) {
        T deleteValue = null;
        if (checkIndex(idx)) {
            Node position = head;
            Node deleteNode;

            if (idx != 0) {
                for (int i = 0; i < idx - 1; i++) {
                    position = position.getNext();
                }
                deleteNode = position.getNext();
                deleteValue = (T) deleteNode.getElement();
                position.setNext(position.getNext().getNext());
                deleteNode.setNext(null);
            } else {
                deleteValue = position.getElement();
                head = position.getNext();
            }
            size--;
        }
        return deleteValue;
    }

    public int indexOf(T element) {
        if (!isEmpty()) {
            Node position = head;
            for (int i = 0; i < size; i++) {
                if (position.getElement() == element) {
                    return i;
                } else {
                    position = position.getNext();
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(T element) {
        int value = 0;
        if (!isEmpty()) {

            Node position = head;
            for (int i = 0; i < size; i++) {
                if (position.getElement() == element) {
                    value = i;

                }
                position = position.getNext();

            }
            return value;
        }
        return -1;
    }


    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }


    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        if (head != null) {
            Node position = head;
            while (position != null) {
                if (position.getNext() != null) {
                    stringBuilder.append(position.getElement() + ", ");
                } else {
                    stringBuilder.append(position.getElement());
                }
                position = position.getNext();
            }
        }
        stringBuilder.append("}");

        return stringBuilder.toString();
    }

    public boolean checkIndex(int idx) {
        if (idx < size || idx > 0) {
            return true;
        }
        return false;
    }

    public boolean contains(T element) {
        if (!isEmpty()) {
            Node position = head;
            for (int i = 0; i < size; i++) {
                if (position.getElement() == element) {
                    return true;
                }
                position = position.getNext();
            }
        }
        return false;
    }


    @Override
    public Iterator iterator() {
        return new GenLinkedListIterator();
    }


    private class GenLinkedListIterator implements Iterator {

        private Node position = head;

        private int cursor = -1;

        @Override
        public boolean hasNext() {
            if (position.getNext() != null) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            T element = position.getElement();
            position = position.getNext();
            cursor++;
            System.out.println(cursor);
            return element;

        }

        @Override
        public void remove() {
            Node dellPosition;
            position = head;
            if (cursor != 0) {
                for (int i = 0; i < cursor - 1; i++) {
                    position = position.getNext();
                }
                dellPosition = position.getNext();
                position.setNext(position.getNext().getNext());
                dellPosition.setNext(null);
            } else {
                head = position.getNext();
                position.setNext(null);
            }

        }
    }

}
