package lessons3.Figures;

/**
 * Created by Denni on 18.05.2016.
 */
public class Squar extends Rectangle {
    public Squar(Integer x) {
        super(x, x);
    }


//    public Squar(Integer x) {
//        super(x, x);
//    }

    @Override
    public void aboutFigure() {
        System.out.println("Квадрат");
    }


}
