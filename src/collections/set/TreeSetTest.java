package collections.set;

/**
 * Created by Denni on 10.06.2016.
 */
public class TreeSetTest {

    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet();

        System.out.println(treeSet.add(10));
        System.out.println(treeSet.add(20));
        System.out.println(treeSet.add(30));
        System.out.println(treeSet.add(5));
        System.out.println(treeSet.add(9));
        System.out.println(treeSet.add(11));
        System.out.println(treeSet.add(8));
        System.out.println(treeSet.add(33));
//        System.out.println(treeSet.add(12));
//        System.out.println(treeSet.add(21));
//        System.out.println(treeSet.add(31));
//        System.out.println(treeSet.add(51));
//        System.out.println(treeSet.add(91));
//        System.out.println(treeSet.add(14));
//        System.out.println(treeSet.add(81));
//        System.out.println(treeSet.add(34));
//        System.out.println(treeSet.add(15));
//        System.out.println(treeSet.add(54));
//        System.out.println(treeSet.add(36));
//        System.out.println(treeSet.add(56));
//        System.out.println(treeSet.add(94));
//        System.out.println(treeSet.add(17));
//        System.out.println(treeSet.add(87));
//        System.out.println(treeSet.add(37));
        System.out.println("______________________________");
//        System.out.println(treeSet.contains(20));
    treeSet.loc();


        System.out.println(treeSet.contains(33));

        System.out.println(treeSet.remove(33));
        System.out.println(treeSet.contains(33));
        treeSet.loc();

        java.util.TreeSet treeSet1 = new java.util.TreeSet();
    }
}
