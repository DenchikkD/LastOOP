package collections.list;

/**
 * Created by Denni on 01.06.2016.
 */
public class Main {
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(7);
//        arrayList.add(4);
//        arrayList.add(5);
//        arrayList.add(6);
//        arrayList.add(7);
//        arrayList.add(7);
//        arrayList.add(9);
//        arrayList.add(10);
//        arrayList.add(11);
//        System.out.println(arrayList);
//        arrayList.add(2, 500);
//        System.out.println(arrayList);
//        int setReturn = arrayList.set(2, 200);
//        System.out.println(arrayList);
//        System.out.println(setReturn);
//
//        System.out.println("get element(idx = 2) " + arrayList.get(2));
//
//        int setRemuve = arrayList.remove(2);
//
//        System.out.println(setRemuve);
//        System.out.println(arrayList);
//        System.out.println(arrayList.indexOf(7));
//        System.out.println(arrayList.lastIndexOf(7));
//        System.out.println(arrayList.contains(17));

        List linkedList = new LinkedList();
        for (int idx = 0; idx < 5; idx++) {
            linkedList.add(10 * idx);
        }
        linkedList.add(100);
        System.out.println(linkedList);
        System.out.println(linkedList.size());
        linkedList.add(2, 100);
        System.out.println(linkedList);
        linkedList.add(1, 200);
        System.out.println(linkedList);
        linkedList.add(0, 300);
        System.out.println(linkedList);
        linkedList.set(1,600);
        System.out.println(linkedList);

        System.out.println(linkedList.get(1));

        System.out.println(linkedList.remove(1));
        System.out.println(linkedList);
        System.out.println(linkedList.indexOf(100));
        System.out.println(linkedList.lastIndexOf(100));
        System.out.println(linkedList.contains(100));
        System.out.println(linkedList.contains(100000));

    }

}
