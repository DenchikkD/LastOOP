package lesoons1;

/**
 * Created by Denni on 11.05.2016.
 */

public class CarsMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.start();
        car1.addFuel(20);
        car1.addFuel(40);
        car1.addFuel(1);
        car1.start();
        car1.drive(100);
        car1.printAboutMe();
        Driver driver = new Driver();
        driver.setCar(car1);
        driver.printAboutMe();
        driver.crashCar();
        car1.printAboutMe();
    }
}



//public class CarsMain {
//    public static void main(String[] args) {
//        Car car1 = new Car();
//        car1.sturt();
//        car1.addFuel(30);
//
//        car1.drive(100);
//        car1.printAboutMe();
//
//
//        Driver driver = new Driver();
//        driver.setCar(car1);
//        driver.printAboutMe();
//        driver.crahCar();
//        driver.printAboutMe();
//
//    }
//
//}
