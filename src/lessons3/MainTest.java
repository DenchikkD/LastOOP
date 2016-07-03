package lessons3;

/**
 * Created by Denni on 18.05.2016.
 */
public class MainTest {
    public static void main(String[] args) {
        Smatrphone smatrphone = new Smatrphone("Lenovo", "White", "Android");
        System.out.println(smatrphone);

        Phone phone = new Phone("Lenovo", "Black");
        Phone phone2 = new Phone("Lenovo", "Black");
        System.out.println(phone.equals(phone2));
        System.out.println(phone2.equals(phone));
        System.out.println(phone == phone2);

        Smatrphone smatrphone1 = new Smatrphone("Lenovo", "White", "Android");
        Smatrphone smatrphone2 = new Smatrphone("Lenovo", "White", "Android");
        System.out.println(smatrphone2.equals(smatrphone1));
        System.out.println(smatrphone1.equals(smatrphone2));


        System.out.println("Phone 1 hashcode = " + phone.hashCode());
        System.out.println("Phone 2 hashcode = " + phone2.hashCode());
        System.out.println("Heshcodes: Phone 1 = Phone 2: " + (phone.hashCode() == phone2.hashCode()));

        System.out.println("Smartphone 1 hashcode = " + smatrphone1.hashCode());
        System.out.println("Smartphone 2 hashcode = " + smatrphone2.hashCode());
        System.out.println("Heshcodes: Phone 1 = Phone 2: " + (smatrphone1.hashCode() == smatrphone2.hashCode()));


    }
}
