package lessons9;

/**
 * Created by Denni on 08.06.2016.
 */
public class Box<T,S> {

    private T foo;
    private S oof;

    public Box(T foo, S oof) {
        this.foo = foo;
        this.oof = oof;
    }

    public T getFoo() {
        return foo;
    }

    public S getOof() {
        return oof;
    }
}
