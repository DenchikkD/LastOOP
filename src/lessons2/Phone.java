package lessons2;

import java.util.ArrayList;

/**
 * Created by Denni on 13.05.2016.
 */
public class Phone {
    private String model;
    private SimCard simCard;
    private ArrayList<Contact> contacts;

    public Phone(String model, SimCard simCard) {
        this.model = model;
        this.simCard = simCard;
        this.contacts = new ArrayList<Contact>();// підготовка колекції для заповнення контактів
    }

    public void prinAboutMe() {
        System.out.println("Phone : " + model + "\n" + "Operator : " + simCard.getOperator()+"\n"+"Balance "+ simCard.getBalance());
    }

    public void addContact(Contact contacts) {
        this.contacts.add(contacts);
    }

    public boolean refillBalance(Integer coins) {
        if (coins > 0) {
            simCard.setBalance(coins);
            return true;
        } else {
            return false;

        }
    }

    public void printAllContacts() {
        if (contacts.size() > 0) {
            for (Contact contact : contacts) {
                contact.printContactCard();

            }
        } else {
            System.out.println("No Contact");
        }

    }

    public void coll(Integer phone, Integer min) {
        if (simCard.getBalance() > 0) {
            System.out.println("Colling " + phone);
            for (int minutes = min; minutes > 0; minutes--) {
                simCard.callBalance(simCard.getBalance() - simCard.getMinuteCost());

            }
        }
    }

}
