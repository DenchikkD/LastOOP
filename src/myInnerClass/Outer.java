package myInnerClass;

/**
 * Created by Denni on 07.06.2016.
 */
class Outer {

    int i = 1;
    Inner inner = new Inner();

    void h() {
        inner.g();
        inner.v();
    }


    class Inner {
        int p = 2;

        void g() {
            Outer.this.i++;

        }

        void v() {
            Inner.this.p++;
        }
    }
}
