package collections.myLinkedKistColection;

import java.util.NoSuchElementException;

/**
 * Created by Denni on 05.06.2016.
 */
public class MyLinkedList implements MyList {
    private Node head;
    private Node tail;
    private Node position;
    private int size;


    public MyLinkedList() {
        size = 0;
    }

    private class Node {
        private int element;
        private Node prev;
        private Node next;

        public Node(int element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public int getElement() {
            return element;
        }

        public void setElement(int element) {
            this.element = element;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    @Override
    public void add(int element) {
        Node nd = new Node(element, null, null);
        if (tail != null) {
            tail.setNext(nd);
            nd.setPrev(tail);
            tail = nd;
        } else {
            tail = head = nd;
        }
        size++;
    }

    public Node getPosition(int idx) {
        if (idx <= size / 2) {
            position = head;
            for (int i = 0; i < idx; i++) {
                position = position.getNext();
            }
        } else {
            position = tail;
            for (int i = size - 1; i != idx; i--) {
                position = position.getPrev();
            }
        }
        return position;
    }

    @Override
    public void add(int idx, int element) {
        checkIndex(idx);
        Node nd = new Node(element, null, null);

        if (idx != 0) {
            getPosition(idx);
            position.getPrev().setNext(nd);
            nd.setPrev(position.getPrev());
            nd.setNext(position);
            position.setPrev(nd);
        } else {
            nd.setNext(position);
            nd.setPrev(null);
            position.setPrev(nd);
            head = nd;
        }
        size++;
    }

    @Override
    public int set(int idx, int element) {
        checkIndex(idx);
        int oldValue = 0;
        getPosition(idx);
        oldValue = position.getElement();
        position.setElement(element);
        return oldValue;
    }

    @Override
    public int get(int idx) {
        checkIndex(idx);
        getPosition(idx);
        return position.getElement();
    }

    public int getFirst() {
        if (!isEmpty()) {
            return head.getElement();
        }

        throw new NoSuchElementException();
    }

    public int getLast() {
        if (!isEmpty()) {
            return tail.getElement();
        }
        throw new NoSuchElementException();
    }

    @Override
    public int remove(int idx) {
        checkIndex(idx);
        int removeValue = 0;
        if (idx != 0) {
            getPosition(idx);
            Node deleteNode = position;
            removeValue = deleteNode.getElement();
            position.getPrev().setNext(position.getNext());
            deleteNode.getNext().setPrev(position);
            deleteNode.setPrev(null);
            deleteNode.setNext(null);
            deleteNode = null;
        } else {
            position = head;
            removeValue = position.getElement();
            head = position.getNext();
            position.getNext().setPrev(null);
        }
        size--;
        return removeValue;
    }

    @Override
    public int indexOf(int element) {
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

    @Override
    public int lastIndexOf(int element) {
        if (!isEmpty()) {
            Node position = tail;
            for (int i = size - 1; i >= 0; i--) {
                if (position.getElement() == element) {
                    return i;
                } else {
                    position = position.getPrev();
                }

            }

        }
        return -1;
    }

    @Override
    public int size() {
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
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        if (head != null) {
            Node nd = head;
            while (nd != null) {

                if (nd.next != null) {
                    builder.append(nd.getElement() + ", ");
                } else {
                    builder.append(nd.getElement());
                }
                nd = nd.getNext();
            }
        }
        builder.append("]");
        return builder.toString();
    }

    private void checkIndex(int idx) {
        if (idx > size || idx < 0) {
            throw new IndexOutOfBoundsException();
        }
    }
}
