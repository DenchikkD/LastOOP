package DzLessons3_4.Plaanes;

/**
 * Created by Denni on 23.05.2016.
 */
public class MainPlane {
    public static void main(String[] args) {
        Plane plane = new Plane("Boin", "White", "A-7");
         int[][] coord={{1,1},{2,2}};

        plane.start();
        plane.selectRoute(coord);
        plane.printRoute();
        plane.printAboutMe();
    }
}
