package lesoons1;

/**
 * Created by Denni on 11.05.2016.
 */

public class Driver {
    String name = "Zigizmund";
    Integer age = 95;
    private Car car = null;
    public void setCar(Car car) {
        this.car = car;
    }
    public void crashCar() {
        if (car != null) {
            System.out.println("Crashing complete...");
            car.setCrashStatus(true);
            car = null;
        }
    }
    public void printAboutMe() {
        System.out.println("Name   :" + name);
        System.out.println("Age    :" + age);
        if (car != null) {
            System.out.println("My car :" + car.model + " " + car.color);
        }
    }
}




//public class Driver {
//    String name = "Vova";
//    Integer age = 95;
//    private Car car;
//
//    public void setCar(Car car) {
//        this.car = car;
//    }
//
//    public void crahCar() {
//        Integer crash = (int) (Math.random() * 101);
//        if (car != null) {
//
//            if (crash <= 20) {
//                System.out.println(name + " вижив");
//                car.setCrashStatus(false);
//            } else if (crash <= 90) {
//
//                System.out.println("Crashing complete...");
//                car.setCrashStatus(true);
//                car = null;
//            } else {
//                System.out.println("Could not stand the heart");
//                System.out.println("Crashing complete...");
//                car.setCrashStatus(true);
//                car = null;
//            }
//
//
//        }
//
//
//    }
//
//    public void printAboutMe() {
//        System.out.println("Name : " + name);
//        System.out.println("Age : " + age);
//        if (car != null) {
//            System.out.println("My car : " + car.model + " " + car.color);
//        }
//
//    }
//
//}
