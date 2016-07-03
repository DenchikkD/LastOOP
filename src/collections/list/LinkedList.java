package collections.list;

/**
 * Created by Denni on 03.06.2016.
 */
public class LinkedList implements List {

    private Node head;
    private Node tail;
    private Integer size;

    private class Node {
        private Integer element;
        private Node next;

        public Node(Integer element) {
            this.element = element;
        }

        public Integer getElement() {
            return element;
        }

        public void setElement(Integer element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public LinkedList() {
        size = 0;
    }

    @Override
    public void add(int elemen) {
        Node nd = new Node(elemen);
        if (head == null & tail == null) {
            head = tail = nd;
        } else {
            tail.setNext(nd);
            tail = nd;
        }
        size++;
    }

    @Override
    public void add(int idx, int element) {
        checkIndex(idx);
        Node nd = new Node(element);
        Node position = head;
        int count = 0;
        if (idx != 0) {
            while (position != null) {
                if (count == idx - 1) {
                    break;
                }
                position = position.getNext();
                count++;
            }
            nd.setNext(position.getNext());
            position.setNext(nd);
        } else {
            nd.setNext(position);
            head = nd;
        }
        size++;
    }

    @Override
    public int set(int idx, int element) {
        checkIndex(idx);
        int oldValue = 0;
        Node position = head;
        int count = 0;
        while (count != idx) {
            position = position.getNext();
            count++;
        }
        oldValue = position.getElement();
        position.setElement(element);
        return oldValue;
    }

    @Override
    public int get(int idx) {
        checkIndex(idx);
        Node position = head;
        for (int i = 0; i != idx; i++) {
            position = position.getNext();
        }
        return position.getElement();
    }

    @Override
    public int remove(int idx) {
        checkIndex(idx);
        int removeValue = 0;
        Node position = head;
        for (int i = 0; i != idx - 1; i++) {
            position = position.getNext();

        }
        Node deleteNode = position.getNext();
        position.setNext(position.getNext().getNext());
        removeValue = deleteNode.getElement();
        deleteNode.setNext(null);
        position = deleteNode = null;

        return removeValue;
    }

    @Override
    public int indexOf(int element) {
        int count = 0;
        if (!isEmpty()) {
            Node position = head;

            while (position != null) {
                if (position.getElement() == element) {
                    return count;
                }
                position = position.getNext();
                count++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(int element) {
        int currentIDX = -1, cout = 0;
        if (!isEmpty()) {
            Node position = head;

            while (position != null) {
                if (position.getElement() == element) {
                    currentIDX = cout;
                }
                position = position.getNext();
                cout++;
            }
        }
        return currentIDX;
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
            Node nd = head;
            while (nd != null) {
                if (nd.getElement() == element) {
                    return true;
                }
                nd = nd.getNext();
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
        if (size < idx || idx < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

}
