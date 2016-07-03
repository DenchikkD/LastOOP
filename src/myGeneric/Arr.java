package myGeneric;


import java.util.Arrays;
import java.util.List;

/**
 * Created by Denni on 10.06.2016.
 */
public class Arr {
    public static void main(String[] args) {

//        List ralist = new ArrayList<>();
//        List<String> list = new ArrayList<>();
//        ralist = list;
//        ralist.add(8);

        SomeType<?> someType = new SomeType<Object>();
        List<String> stringList = Arrays.asList("Hello");

        someType.test(stringList);

    }
}
