//package collections.queue;
//
///**
// * Created by Denni on 25.05.2016.
// */
//public class LinkedQueue implements Queue {
//
//    //InnerClass  внутрішній клас
//    private class Node {
//        public Integer element;
//        public Node next;
//
//        public Node(Integer element, Node next) {
//            this.element = element;
//            this.next = next;
//        }
//
//        public Node getNext() {
//            return next;
//        }
//
//        public void setNext(Node next) {
//            this.next = next;
//        }
//    }
//
//    private Integer size;
//    private Node head;
//    private Node tail;
//
//    public LinkedQueue() {
//        this.size = 0;
//    }
//
//    @Override
//    public void push(int element) {
//        Node nd = new Node(element, null);
//        if ( tail != null) {
//
//            tail.setNext(nd);
////            tail.next=nd;
//
//            tail = nd;
//        } else {
//            head = nd;
//            tail = nd;
//        }
//        size++;
//
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder builder = new StringBuilder();
//        builder.append("HEAD -> ");
//        if (head != null) {
//            Node nd = head;
//            while (nd != null) {
//                builder.append(nd.element + " ");
//                nd = nd.next;
//            }
//        }
//        builder.append(" <- TAIL");
//        return builder.toString();
//    }
//    @Override
//    public Integer pop() {
//        if(head!=null){
//            Integer element = head.element;
//            head=head.next;
//            size--;
//            return element;
//
//        }else{
//
//
//            return null;
//        }
//
//    }
//
//    @Override
//    public Integer size() {
//        return size();
//    }
//
//    @Override
//    public boolean isEmpty() {
//        if (size() == 0) {
//            return true;
//        }
//        return false;
//    }
//}
