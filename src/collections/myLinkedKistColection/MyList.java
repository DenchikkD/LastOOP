package collections.myLinkedKistColection;

import java.util.List;

/**
 * Created by Denni on 05.06.2016.
 */
public interface MyList extends MyLinkedCollection {

    public void add(int element);

    public void add(int idx, int element);

    public int set(int idx, int element);

    public int get(int idx);

    public int remove(int idx);

    public int indexOf(int element);

    public int lastIndexOf(int element);

}
