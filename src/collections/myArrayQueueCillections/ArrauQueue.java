package collections.myArrayQueueCillections;

import java.util.*;

/**
 * Created by Denni on 31.05.2016.
 */
public class ArrauQueue implements MyQueue {
    private Integer[] arrayQueue;
    private Integer maxSize;
    private Integer size;
    private Integer head;
    private Integer tail;


    public ArrauQueue(Integer maxSize) {
        this.maxSize = maxSize;
        arrayQueue = new Integer[maxSize];
        head = 0;
        tail = 0;
        size = 0;
    }

    @Override
    public boolean offer(Integer value) {
        if (!isFull()) {

            arrayQueue[tail++] = value;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public Integer remove() throws NoSuchElementException {
        if (head != maxSize) {
            Integer temp = arrayQueue[head++];
            size--;
            return temp;


        }
        throw new NoSuchElementException();
    }

    @Override
    public Integer poll() {
        if (head != maxSize) {
            Integer temp = arrayQueue[head++];
            size--;
            return temp;
        }
        return null;
    }


    @Override
    public Integer element() throws NoSuchElementException {
        if (!isEmpty()) {
            return arrayQueue[head];
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public Integer peek() {
        if (!isEmpty()) {
            Integer temp = arrayQueue[head];
            return temp;
        }
        return null;
    }

    @Override
    public Integer size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == maxSize;
    }

    @Override
    public boolean contains(Integer[] arrayQueue) {
        return false;
    }

}
