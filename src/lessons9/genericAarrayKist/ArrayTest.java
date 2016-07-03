package lessons9.genericAarrayKist;

import javafx.scene.input.InputMethodTextRun;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Denni on 08.06.2016.
 */
public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        System.out.println(list);
        list.add(0, 100);
        System.out.println(list);
        list.set(1, 500);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.remove(0));
        System.out.println(list);

//        List<Integer> linkedList= new LinkedList<Integer>();
//        for (int i = 0; i <10 ; i++) {
//            linkedList.add(10*i);
//        }
//        //FOR-EACH
//        Iterator<Integer> iterator = linkedList.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next()+" ");
//        }


        for (int i = 0; i < 10; i++) {
            list.add(10 + i);
        }

//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//
//        }
//        System.out.println(list);
//        System.out.println(iterator.hasNext());
//        System.out.println( iterator.next());
//        iterator.remove();
//        System.out.println(list);

//        iterator.remove();
//
//        for (Integer in : list) {
////            in.
//
//        }
        Integer integer = null;
        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            integer = iterator.next();
            System.out.println(integer);
            if (integer == 19) {
                System.out.println(integer);
                iterator.remove();
                break;
            }
        }
        System.out.println(list);

    }
}
