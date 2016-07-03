package lesoons1;

/**
 * Created by Denni on 11.05.2016.
 */


public class Car {
    String model = "Ford";
    String color = "Black";
    private Integer year = 2016;
    private Boolean startStatus = false;
    private Boolean crashStatus = false;
    private Integer mills = 0;
    private Integer tank = 0;
    public void start() {
        if (startStatus == false & tank > 0) {
            startStatus = true;
            System.out.println("Starting...");
        } else {
            System.out.println("Require refueling... ");
        }
    }
    public void drive(Integer mills) {
        if (startStatus == true) {
            for (int i = mills; mills > 0; mills = mills - 10) {
                tank--;
            }
            this.mills += mills;
            System.out.println("Driving... " + mills);
        }
    }
    public void addFuel(Integer gallons) {
        if (gallons > 0 & gallons <= 50) {
            if (gallons >= 50 - tank) {
                gallons = 50 - tank;
                tank += gallons;
                System.out.println("Refueling " + gallons + " complete.");
            } else {
                tank += gallons;
                System.out.println("Refueling " + gallons + " complete.");
            }
        }
    }
    public void printAboutMe() {
        System.out.println("Model " + model);
        System.out.println("Color " + color);
        System.out.println("Year " + year);
        System.out.println("Mills " + mills);
        if (crashStatus == true) {
            System.out.println("Crashed!");
        }
    }
    public void setCrashStatus(Boolean crashStatus) {
        if (this.crashStatus != true & crashStatus == true) {
            this.crashStatus = crashStatus;
        }
    }
}



//public class Car {
//    public static final Integer MAX_TANK_GALLONS = 50;
//
//    String model = "Ford";
//    String color = "Black";
//    private Integer year = 2016;
//    private boolean startStatus = false;
//    private boolean crashStatus = false;
//    private Integer mills = 0;
//    public Integer tank = 0;
//
//
//    public void sturt() {
//        if (startStatus == false & tank > 0) {
//
//
//            startStatus = true;
//            System.out.println("Staring...");
//        } else {
//            System.out.println("refuel");
//            startStatus = true;
//        }
//
//
//    }
//
//
//
//    public void addFuel(Integer gallons) {
//        if (gallons <= 0) {
//            System.out.println("Ви не можете заправити " + gallons);
//            startStatus = false;
//        } else if (gallons + tank > MAX_TANK_GALLONS) {
//            System.out.println("Максимальна місткість баку " + MAX_TANK_GALLONS + " Залишок " + tank);
//            startStatus = false;
//        } else {
//            System.out.println("Ви заправились на " + gallons + " до повного баку " + (MAX_TANK_GALLONS - gallons));
//            this.tank = gallons;
//            startStatus = true;
//            System.out.println("Staring...");
//            System.out.println(startStatus);
//        }
//
//    }
//    public void drive(Integer mills) {
//        if (startStatus == true) {
//            System.out.println("Drivin..." + mills);
//            for (int i = mills; tank > 0; mills = mills - 10) {
//                tank--;
//                this.mills += 10;
//            }
//        }
//    }
//
//
//    public void printAboutMe() {
//        System.out.println("Model " + model);
//        System.out.println("Color " + color);
//        System.out.println("Year " + year);
//        System.out.println("Mills " + mills);
//
//        if (crashStatus == true) {
//            System.out.println("Crashed!");
//        }
//    }
//
//    public void setCrashStatus(boolean crashStatus) {
//        if (this.crashStatus != true & crashStatus == true) {
//            this.crashStatus = crashStatus;
//        }
//
//    }
//}
