package lessons4;

import lessons4.interfesses.Car;

/**
 * Created by Denni on 20.05.2016.
 */
public class BaseAuto implements Car {


    @Override
    public void start() {
        System.out.println("Starting..");


    }

    @Override
    public void drive() {
        System.out.println("Driving");
    }
}
