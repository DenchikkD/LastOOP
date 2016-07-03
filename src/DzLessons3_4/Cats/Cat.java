package DzLessons3_4.Cats;

/**
 * Created by Denni on 23.05.2016.
 */
public class Cat extends Animal {

    private String family;

    public Cat(String name, String color, boolean satiety, Integer howManyPaws, String family) {
        super(name, color, satiety, howManyPaws);
        this.family = family;
    }

    @Override
    public void say() {
        super.say();
        System.out.println(" М’яв!!!!");
    }

    public void riseHair() {
        System.out.println("Шерсть дибки!!!");
    }

    @Override
    public void printAboutMe() {
        super.printAboutMe();
        System.out.println("Family: " + family);
    }
}
