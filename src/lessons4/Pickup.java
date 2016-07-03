package lessons4;

import lessons4.interfesses.CargoCar;
import lessons4.interfesses.PassangerCar;

/**
 * Created by Denni on 20.05.2016.
 */
public class Pickup extends BaseAuto implements CargoCar, PassangerCar {


    @Override
    public void transportCargo() {
        System.out.println("Transporting cargo.");

    }

    @Override
    public void transportingPassangers() {

        System.out.println("Transporting passengers.");

    }
}
