package lessons3.Figures;

import java.util.ArrayList;

/**
 * Created by Denni on 18.05.2016.
 */
public class MeinTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.coordinats();
        rectangle.aboutFigure();
        rectangle.square();
        Squar squar = new Squar(5);
        squar.aboutFigure();
        squar.square();

        ArrayList<Figure> figures = new ArrayList<Figure>();
        figures.add(rectangle);
        figures.add(squar);

        System.out.println("**************");
        for (Figure figure : figures) {
            figure.aboutFigure();
            figure.square();
        }


    }
}
