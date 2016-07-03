package lessons4;

import lessons4.interfesses.Car;
import lessons4.interfesses.CargoCar;

/**
 * Created by Denni on 20.05.2016.
 */
public class Truck extends BaseAuto implements Car, CargoCar {
    @Override
    public void transportCargo() {
        System.out.println("Transporting cargo.");

    }


}
