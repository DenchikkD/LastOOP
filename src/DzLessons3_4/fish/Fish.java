package DzLessons3_4.fish;

import java.util.List;

/**
 * Created by Denni on 24.05.2016.
 */
public class Fish extends Product {
    private String colorOfMeat;
    private Integer distance;
    private Fish fish;
    private Acvarium acvarium;

    public Fish(String tipeProduct, Integer price, Integer code, Integer weidth, String country, String date, String colorOfMeat) {
        super(tipeProduct, price, code, weidth, country, date);
        this.colorOfMeat = colorOfMeat;
    }

    public void swim() {
        distance = 5;
        System.out.println("Distance: " + distance + " miles");
    }

//    public void cannibalism(Fish fish) {
//        System.out.println("Niam:+" + fish);
//
//
//    }

    public void cannibalism(List<Fish> fishes) {
        if (fishes.size() == 1) {

            System.out.println("aaaaaaaaaa");
            return;
        }
        for (Fish fish : fishes) {

            if (!fish.equals(this)) {

                System.out.println("This fish " + tipeProduct + " eat fish : " + fish);
                fishes.remove(fish);
                break;
            }

        }
    }

    public void cannibalism() {
        if (acvarium.acvarium.size() == 1) {

            System.out.println("aaaaaaaaaa");
            return;
        }
        for (Fish fish : acvarium.getAcvarium()) {


            if (!fish.equals(this)) {

                System.out.println("This fish " + tipeProduct + " eat fish : " + fish);
                acvarium.getAcvarium().remove(fish);
                break;
            }

        }


    }

    @Override
    public String toString() {

        return super.toString() +
                "colorOfMeat= '" + colorOfMeat + '\'' +
                '}';
    }

    public Acvarium getAcvarium() {
        return acvarium;
    }

    public void setAcvarium(Acvarium acvarium) {
        this.acvarium = acvarium;
    }
}
