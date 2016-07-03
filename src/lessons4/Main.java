package lessons4;

import lessons4.interfesses.Car;
import lessons4.interfesses.CargoCar;

/**
 * Created by Denni on 20.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new BaseAuto();



        car.start();
        car.drive();

        CargoCar truck = new Truck();
        truck.start();
        truck.drive();
        truck.transportCargo();

        Pickup pickup = new Pickup();
        pickup.start();
        pickup.drive();
        pickup.transportCargo();
        pickup.transportingPassangers();



    }
}
