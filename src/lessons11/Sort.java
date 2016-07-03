package lessons11;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denni on 15.06.2016.
 */
public final class Sort {

    private static int iterations = 0;

    public static List<Integer> newRandomList(Integer size) {
        List<Integer> list = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * 1000));
        }
        return list;
    }

    public static int iterations() {
        return iterations;
    }

    public static List<Integer> clone(List<Integer> list) {
        List<Integer> clone = new ArrayList<Integer>();
        for (Integer integer : list) {
            clone.add(integer);
        }
        return clone;
    }

    public static void stupied(List<Integer> list) {
        iterations = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                Integer temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
                i = -1;
            }
            iterations++;
        }
    }

    public static void bubble(List<Integer> list) {
        iterations = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }
                iterations++;
            }
            iterations++;
        }
    }

    public static void selection(List<Integer> list) {
        iterations = 0;
        for (int i = 0; i < (list.size() - 1); i++) {
            int minI = i, minJ = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(minI)
                        & list.get(j) < list.get(minJ)) {
                    minJ = j;
                }
                iterations++;
            }
            Integer temp = list.get(i);
            list.set(i, list.get(minJ));
            list.set(minJ, temp);
            iterations++;
        }
    }

    public static void insertion(List<Integer> list) {
        iterations = 0;
        int tmp = 0;
        int j = 0;

        for (int i = 1; i < list.size(); i++) {
            tmp = list.get(i);
            for (j = i; j > 0 && list.get(j - 1) > tmp; j--) {
                list.set(j, list.get(j - 1));
                iterations++;
            }
            list.set(j, tmp);
            iterations++;
        }
    }

    public static void shellSort(List<Integer> list) {
        iterations = 0;
        int tmp = 0;
        int step = list.size() / 2;

        while (step > 0) {

            for (int i = step; i < list.size(); i++) {
                tmp = list.get(i);
                while (i >= step && list.get(i - step) >= tmp) {
                    list.set(i, list.get(i - step));
                    i -= step;
                    iterations++;
                }
                list.set(i, tmp);

            }
            if (step % 2 == 0) {
                step = step / 2;
            } else if (step < list.size() / 2 && step > 1) {
                step = step / 2 + 1;

            } else {
                step = step / 2 - 1;
            }
        }
    }
}


