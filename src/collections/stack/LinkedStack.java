//package collections.stack;
//
///**
// * Created by Denni on 20.05.2016.
// */
//public class LinkedStack implements Stack {
//
//    private Node head;
//    private Integer size;
//
//
//    public LinkedStack() {
//        size = 0;
//    }
//
//    @Override
//    public void push(int element) {
//        Node nd = new Node(element, null);
//
//        if (head != null) {
//
//            nd.setNext(head);
//            head = nd;
//
//        } else {
//            head = nd;
//        }
//        size++;
//    }
//
//    @Override
//    public int pop() {
//        int element = 0;
//        if (head != null & head.getNext() != null) {
//            element = head.getElement();
//            head = head.getNext();
//        } else {
//            element = head.getElement();
//            head = null;
//        }
//        size--;
//
//        return element;
//    }
//
//    @Override
//    public Integer size() {
//
//        return size;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        if (size == 0) {
//            return true;
//        }
//        return false;
//    }
//
//
//}
