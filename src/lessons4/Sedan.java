package lessons4;

import lessons4.interfesses.PassangerCar;

/**
 * Created by Denni on 20.05.2016.
 */
public class Sedan extends BaseAuto implements PassangerCar {
    @Override
    public void transportingPassangers() {
        System.out.println("Transporting passengers.");
    }
}
