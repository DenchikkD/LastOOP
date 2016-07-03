package lessons3.Figures;

/**
 * Created by Denni on 18.05.2016.
 */
public class Rectangle extends Figure {
    private Integer x;
    private Integer y;



    public Rectangle(Integer x, Integer y) {
        super(x, y); // якщо треба пыти до координат поінта
        this.x = x;
        this.y = y;
    }

    @Override
    public void square() {
        super.square();
        System.out.println("Площа: " + (x * y));

    }

    @Override
    public void aboutFigure() {
        super.aboutFigure();
        System.out.println("Rectangle");
    }

    public void coordinats() {

        System.out.println("Координати: X = " + super.getX() + " Y = " + super.getY());
    }
}
