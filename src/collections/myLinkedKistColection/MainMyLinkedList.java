package collections.myLinkedKistColection;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by Denni on 05.06.2016.
 */
public class MainMyLinkedList {
    public static void main(String[] args) {
        long t1= System.nanoTime();
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(6);
//        System.out.println(myLinkedList);
//        System.out.println(myLinkedList.size());
//        System.out.println(myLinkedList.get(3));
//        System.out.println(myLinkedList.getFirst());
//        System.out.println(myLinkedList.getLast());
//        System.out.println(myLinkedList.set(3, 100));
//        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList);
        myLinkedList.add(4, 200);
        System.out.println(myLinkedList);
//        System.out.println(myLinkedList.size());
//        System.out.println(myLinkedList);
//        myLinkedList.add(0, 300);
//        myLinkedList.add(5, 300);
//        System.out.println(myLinkedList.size());
//        System.out.println(myLinkedList);
//        System.out.println(myLinkedList.remove(3));
//        System.out.println(myLinkedList);
//        System.out.println(myLinkedList.indexOf(300));
//
//        System.out.println(myLinkedList.lastIndexOf(300));
//        System.out.println(myLinkedList.contains(3000));
        System.out.println(myLinkedList.set(3,300));
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.remove(3));
        System.out.println(myLinkedList);
        long t2=System.nanoTime();
        System.out.println(t2-t1);
    }
}
