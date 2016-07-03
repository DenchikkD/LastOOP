package DzLessons3_4.Cats;

/**
 * Created by Denni on 23.05.2016.
 */
public class Animal {
    private String name;
    private String color;
    private boolean satiety;
    private Integer howManyPaws;

    public Animal() {
    }

    public Animal(String name, String color, boolean satiety, Integer howManyPaws) {
        this.name = name;
        this.color = color;
        this.satiety = satiety;
        this.howManyPaws = howManyPaws;
    }

    public void printName() {
        System.out.print("Мене звати: " + name + "\n");

    }

    public void say() {
        System.out.println("Голос!!!! ");

    }

    public void eat() {
        this.satiety = true;
        System.out.println("Meal");

    }

    public void yellIfNotGorged() {
        if (this.satiety == false) {
            System.out.println(" I am hungry !!!");
        } else {
            System.out.println(" I am fed up ");
        }

    }

    public void printAboutMe() {
        System.out.println("My name is: " + name + "\nColor: " + color + "\nHow many paws: " + howManyPaws);
    }

}
