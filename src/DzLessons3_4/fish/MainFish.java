package DzLessons3_4.fish;

import java.util.List;

/**
 * Created by Denni on 24.05.2016.
 */
public class MainFish {
    public static void main(String[] args) {
        Fish fish = new Fish("Fish", 25, 852365, 5, "Ucraine", "25.06.2016", "red");
        Fish fish1 = new Fish("Fish", 25, 852365, 5, "Ucraine", "25.06.2016", "white");
        Acvarium acvarium = new Acvarium();


        System.out.println(fish);
        System.out.println(fish1);
        fish.printPrice();
        fish.printStoragePeriod();
        fish.printBarAndPrice();
        fish.swim();

        acvarium.addToAcvarium(fish);
        acvarium.addToAcvarium(fish1);
//        fish.cannibalism(fish1);
        eatFish(acvarium.getAcvarium());
        acvarium.printAmoutAcvariu();


    }


public static void eatFish(List<Fish> fishes){
//    fishes.get(0).cannibalism(fishes);
    fishes.get(0).cannibalism();
    fishes.get(0).cannibalism();

    System.out.println("1");
}
}

