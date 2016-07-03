package DzLessons3_4.Plaanes;

/**
 * Created by Denni on 23.05.2016.
 */
public class Plane extends Wing {
    private String name;
    private String color;
    private String model;
    private int[][] coord;


    public Plane(String name, String color, String model) {
        this.name = name;
        this.color = color;
        this.model = model;
    }

    public void selectRoute(int[][] coordinates) {
        this.coord = coordinates;

    }


    public void printRoute() {

        for (int i = 0; i < coord.length; i++) {
            System.out.println(coord[i][0] + " " + coord[i][1]);

        }

    }

    public void printAboutMe() {
        System.out.println("Name: " + name + "\nColor: " + color + "\nModel: " + model);
    }

}

