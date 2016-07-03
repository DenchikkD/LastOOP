package collections.list;

import collections.Collection;

/**
 * Created by Denni on 01.06.2016.
 */
public interface List extends Collection {
    void add(int elemen);

    void add(int idx, int element);

    int set(int idx, int element);

    int get(int idx);

    int remove(int idx);

    int indexOf(int element);

    int lastIndexOf(int element);

}
