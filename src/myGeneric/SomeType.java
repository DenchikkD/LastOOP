package myGeneric;

import java.util.Collection;
import java.util.List;

/**
 * Created by Denni on 10.06.2016.
 */
public class SomeType<T> {

    public <E> void test(Collection<E> collection) {
        for (E e : collection) {
            System.out.println(e);
            System.out.println("1");


        }
    }

    public void test(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list);

        }
    }
}
