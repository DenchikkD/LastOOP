package lessons4.example;

/**
 * Created by Denni on 20.05.2016.
 */
public class main {
    public static void main(String[] args) {

        Visibiliti visibiliti = new Visibiliti();
        visibiliti.visibleTest();
        System.out.println(((Visible1)visibiliti).CONST);
        System.out.println(((Visible2)visibiliti).CONST);
    }
}
