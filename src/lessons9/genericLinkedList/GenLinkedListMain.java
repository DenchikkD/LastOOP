package lessons9.genericLinkedList;

import java.util.Iterator;

/**
 * Created by Denni on 09.06.2016.
 */
public class GenLinkedListMain {

    public static void main(String[] args) {
        GenLinkedList<String> genLinkedList = new GenLinkedList<>();
        genLinkedList.add("10");
        genLinkedList.add("20");
        genLinkedList.add("30");
        genLinkedList.add("40");
        genLinkedList.add("50");
        genLinkedList.add("60");
        System.out.println(genLinkedList);
        genLinkedList.add(0, "100");
        genLinkedList.add(4, "20");
        genLinkedList.add(4, "10");

        System.out.println(genLinkedList);
        System.out.println(genLinkedList.set(0, "200"));
        System.out.println(genLinkedList);
        System.out.println(genLinkedList.get(3));
        System.out.println(genLinkedList.remove(6));
        System.out.println(genLinkedList);
        System.out.println(genLinkedList.indexOf("10"));
        System.out.println(genLinkedList.lastIndexOf("20"));
        System.out.println(genLinkedList.contains("3000"));

        System.out.println("__________________________________________________");
        Iterator<String> iterator = genLinkedList.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(genLinkedList);
        iterator.remove();
        System.out.println(genLinkedList);
    }

}
