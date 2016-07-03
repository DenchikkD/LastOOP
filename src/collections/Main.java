package collections;

import collections.deque.Deque;
import collections.deque.LinkedDeque;
//import collections.queue.LinkedQueue;
//import collections.queue.Queue;
//import collections.stack.ArrayStack;
//import collections.stack.LinkedStack;
//import collections.stack.Stack;

/**
 * Created by Denni on 20.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Deque deque = new LinkedDeque();
        if (deque.offer(20)) System.out.println("Offer 20 complete");
        System.out.println(deque.element());
        System.out.println(deque.size());

        System.out.println(deque.getFirst());
        System.out.println(deque.size());

        System.out.println(deque.getLast());
        System.out.println(deque.size());


        System.out.println(deque.getLast());



//---------------------------------------------------------------------
//        Queue queue = new LinkedQueue();
//        queue.push(10);
//        queue.push(20);
//        queue.push(30);
//        queue.push(40);
//        System.out.println(queue);
//
//        System.out.println(queue.pop());
//        System.out.println(queue);
//
//        System.out.println(queue.pop());
//        System.out.println(queue);
//        queue.push(50);
//        System.out.println(queue.pop());
//        System.out.println(queue);
//
//        System.out.println(queue.pop());
//        System.out.println(queue);
//        System.out.println(queue.pop());


        //----------------------------------------------------------
//        Stack stack = new LinkedStack();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//
//        stack.push(40);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        //-----------------------------------------

//        ArrayStack arrayStack = new ArrayStack(10);
//        arrayStack.push(10);
//        arrayStack.push(20);
//        arrayStack.push(30);
//        arrayStack.push(40);
//        arrayStack.push(50);
//        arrayStack.push(60);
//        arrayStack.push(70);
//        arrayStack.push(80);
//        arrayStack.push(90);
//        arrayStack.push(100);
//
//        System.out.println(arrayStack.isEmpty());
//        System.out.println(arrayStack.isFull());
//        System.out.println(arrayStack.pop());
//        System.out.println(arrayStack.pop());
//        printAllElemetsOfStack(arrayStack);
//
//
//    }
//
//    public static void printAllElemetsOfStack(ArrayStack arrayStack) {
//
//        while (!arrayStack.isEmpty()) {
//            System.out.println(arrayStack.pop());
////            if (arrayStack.pop() == -1) {
////                System.out.println("Empty Stack");
////            }
//        }
//
    }


}
