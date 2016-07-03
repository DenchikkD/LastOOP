package collections.myArrayQueueCillections;

/**
 * Created by Denni on 31.05.2016.
 */
public class MainArrayQueue {
    public static void main(String[] args) {
        ArrauQueue arrauQueue = new ArrauQueue(10);
        arrauQueue.offer(15);
        arrauQueue.offer(25);
        arrauQueue.offer(35);
        arrauQueue.offer(45);
        arrauQueue.offer(55);
        arrauQueue.offer(65);
        arrauQueue.offer(75);
        arrauQueue.offer(85);
        arrauQueue.offer(95);
        arrauQueue.offer(105);
        System.out.println(arrauQueue.size());
        System.out.println(arrauQueue.isEmpty());
        System.out.println(arrauQueue.isFull());
        System.out.println(arrauQueue.element());
        System.out.println(arrauQueue.poll());
        System.out.println(arrauQueue.poll());
        System.out.println(arrauQueue.peek());
        System.out.println(arrauQueue.poll());
        System.out.println(arrauQueue.poll());
        System.out.println(arrauQueue.poll());
        System.out.println(arrauQueue.poll());
        System.out.println(arrauQueue.poll());
        System.out.println(arrauQueue.poll());
        System.out.println(arrauQueue.poll());
        System.out.println(arrauQueue.poll());
        System.out.println(arrauQueue.isEmpty());
        System.out.println(arrauQueue.isFull());


    }
}
