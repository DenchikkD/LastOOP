//package collections.stack;
//
///**
// * Created by Denni on 24.05.2016.
// */
//public class ArrayStack implements Stack {
//
//    private Integer maxSixe;
//    private int[] stackArray;
//    private Integer top;
//
//    public ArrayStack(Integer s) {
//        maxSixe = s;
//        stackArray = new int[maxSixe];
//        top = -1;
//
//    }
//
//
//    @Override
//    public void push(int element) {
//        stackArray[++top] = element;
//
//    }
//
//    @Override
//    public int pop() {
//        if(!isEmpty()){
//            return stackArray[top--];
//        }else {
//
//            return -1;
//        }
//
//
//    }
//
//    public boolean isEmpty() {
//        return (top == -1);
//    }
//
//
//
//    public boolean isFull() {
//        return (top == maxSixe - 1);
//    }
//
//
//    @Override
//    public Integer size() {
//        return 0;
//    }
//}
