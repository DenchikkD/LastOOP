package DzLessons3_4.Cats;

/**
 * Created by Denni on 23.05.2016.
 */
public class MainCat {
    public static void main(String[] args) {

        Cat cat = new Cat("Барсік", "Чорний", false, 4, "Котіт");
        cat.printName();
        cat.say();
        cat.yellIfNotGorged();
        cat.eat();
        cat.yellIfNotGorged();
        cat.riseHair();
        cat.printAboutMe();

    }
}
