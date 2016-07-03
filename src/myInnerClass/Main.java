package myInnerClass;

/**
 * Created by Denni on 07.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.h();
        System.out.println(outer.inner.p);
        System.out.println(outer.i);
    }
}
