package lessons11;

import java.util.List;

/**
 * Created by Denni on 15.06.2016.
 */
public class SortTest {
    public static void main(String[] args) {
        List<Integer> test = Sort.newRandomList(10);


        System.out.println("Stupied sort: ");
        List<Integer> integers = Sort.clone(test);
        System.out.println(integers);
//        Long startTime = System.currentTimeMillis();
//        Sort.stupied(integers);
//        Long endTime = System.currentTimeMillis();
//        System.out.println(integers);
//        System.out.println("\nIterations: " + Sort.iterations() + "\nTime: " + (endTime - startTime) + "\n");

//        System.out.println("Bubble sort: ");
//        integers = Sort.clone(test);
//        startTime = System.currentTimeMillis();
//        Sort.bubble(integers);
//        endTime = System.currentTimeMillis();
//        System.out.println(integers);
//        System.out.println("\nIterations: " + Sort.iterations() + "\nTime: " + (endTime - startTime) + "\n");

//        System.out.println("Selection sort :");
//        integers = Sort.clone(test);
//        startTime = System.currentTimeMillis();
//        Sort.selection(integers);
//        endTime = System.currentTimeMillis();
//        System.out.println(integers);
//        System.out.println("\nIterations: " + Sort.iterations() + "\nTime: " + (endTime - startTime) + "\n");

//        System.out.println("Insertion sort: ");
//        integers = Sort.clone(test);
//        startTime = System.currentTimeMillis();
//        Sort.insertion(integers);
//        endTime = System.currentTimeMillis();
//        System.out.println(integers);
//        System.out.println("\nIterations: " + Sort.iterations() + "\nTime: " + (endTime - startTime) + "\n");

        System.out.println("Shell sort: ");
        integers = Sort.clone(test);
//        startTime = System.currentTimeMillis();
        Sort.shellSort(integers);
//        endTime = System.currentTimeMillis();
        System.out.println(integers);
        System.out.println("\nIterations: " + Sort.iterations());
    }
}

