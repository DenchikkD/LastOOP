package collections.deque;

import java.util.NoSuchElementException;

/**
 * Created by Denni on 27.05.2016.
 */
public class LinkedDeque implements Deque {

    private Node head;
    private Node tail;
    private Integer size;

    private class Node {
        int value;
        Node previos;
        Node next;

        public Node(int value, Node previos, Node next) {
            this.value = value;
            this.previos = previos;
            this.next = next;
        }
    }

    public LinkedDeque() {
        size = 0;
    }

    @Override
    public int element() throws NoSuchElementException {
        if (head != null) {
            return head.value;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public boolean offer(int element) {
        Node nd = new Node(element, tail, null);  // замість tail можно null
        if (tail != null) {
            tail.next = nd;
//            nd.previos = tail;
            tail = nd;
            size++;
            return true;

        } else {
            head = tail = nd;
            size++;
            return true;
        }
    }

    @Override
    public Integer peek() {
        if (head != null) {
            return head.value;
        } else {
            return null;
        }
    }

    @Override
    public Integer poll() {
        if (tail != null) {
            return tail.value;
        } else {
            return null;
        }
    }

    @Override
    public Integer remove() throws NoSuchElementException {

        if (head != null) {
            int value = head.value;
            head = head.next;
            size--;
            return value;

        } else {
            throw new NoSuchElementException();
        }

    }

    @Override
    public void addFirst(int element) {
        offerFirst(element);

    }

    @Override
    public void addLast(int element) {
        offerLast(element);
    }

    @Override
    public Integer getFirst() throws NoSuchElementException {
        return remove();

    }

    @Override
    public Integer getLast() throws NoSuchElementException {

        if (tail != null) {
            int value = tail.value;
            tail = tail.previos;
            size--;
            return value;

        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public boolean offerFirst(int element) {

        Node nd = new Node(element, null, head);  // замість tail можно null
        if (head != null) {
            head.previos = nd;
            head = nd;
            size++;
            return true;
        } else {
            head = tail = nd;
            size++;
            return true;
        }
    }

    @Override
    public boolean offerLast(int element) {
        offer(element);
        return true;
    }

    @Override
    public Integer peekFirst() {
        return peek();
    }

    @Override
    public Integer peekLast() {
        return poll();
    }

    @Override
    public int pollFirst() {
        return peek();
    }

    @Override
    public int pollLast() {
        return poll();
    }

    @Override
    public int removeFirst() throws NoSuchElementException {
        return getFirst();
    }

    @Override
    public int removeLast() throws NoSuchElementException {
        return getLast();
    }

    @Override
    public void push(int element) {
        addFirst(element);
    }

    @Override
    public Integer pop() {

        return getFirst();
    }

    @Override
    public Integer size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size != 0) {
            return false;
        }
        return true;
    }


    @Override
    public boolean contains(int element) {
        Node nd = head;
        while (nd != null) {
            if (head.value == element) {
                return true;
            }
            nd = nd.next;
        }
        return false;
    }
}
