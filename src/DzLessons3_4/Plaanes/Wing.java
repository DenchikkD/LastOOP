package DzLessons3_4.Plaanes;

/**
 * Created by Denni on 23.05.2016.
 */
public class Wing {
    private boolean tank;

    public Wing() {
    }

    public Wing(boolean tank) {

    }
    public void start() {
        if (tank == true) {
            System.out.println("Starting...");
        } else {
            System.out.println("Refill...");
            tankRefill();
            System.out.println("Starting...");
        }
        takeOff();
    }

    public void tankRefill() {
        this.tank = true;
    }

    public void takeOff() {
        this.tank = false;

    }


}
