package lessons2;

/**
 * Created by Denni on 13.05.2016.
 */
public class Contact {

    String name;
    Integer phone;
    String email;

    public Contact() {


        this("NoNAme", 503214565, "papapa@mail.ru");
//        name = "NoName";
//        phone = 54644963;
//        email = "test@mail.com";
    }

    public Contact(Integer phone) {
        this("NoNAme", phone, null);
//        name = "NoName";
//        this.phone = phone;
//        email = null;
    }

    public Contact(String name, Integer phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Contact(Contact contact) {
        this(contact.name, contact.phone, contact.email);
    }

    public void printContactCard() {
        System.out.println("Name :" + name + " \n" + "Phone : +380" + phone + "\n" + "E-mail :" + email + "\n");
    }
}
