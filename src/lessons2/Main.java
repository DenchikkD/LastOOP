package lessons2;

/**
 * Created by Denni on 13.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Василий", 502568741, "vasilij@mail.ru");
//        contact1.printContactCard();
        Contact contact2 = new Contact();
//        contact2.printContactCard();
        Contact contact3 = new Contact(671234567);
//        contact3.printContactCard();
        Contact contact4 = new Contact(contact1);
//        contact4.printContactCard();

        SimCard simCard = new SimCard("Vodafon", 2, 1);

        Phone phone = new Phone("Blackberry", simCard);
//        phone.prinAboutMe();
        phone.addContact(contact1);
        phone.addContact(contact2);
        phone.addContact(contact3);
        phone.addContact(contact4);

        phone.refillBalance(10);
        System.out.println("Refill Balance "+ phone.refillBalance(10));
        phone.printAllContacts();
        phone.coll(123,2);
        phone.prinAboutMe();


    }
}
