package DzLessons3_4.fish;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denni on 24.05.2016.
 */
public class Acvarium {

    protected List<Fish> acvarium = new ArrayList<Fish>();

    public void addToAcvarium(Fish fish) {
        acvarium.add(fish);
        fish.setAcvarium(this);
    }

    public void printAmoutAcvariu() {
        for (Fish v : acvarium) {
            System.out.println(v);

        }


    }

    public List<Fish> getAcvarium() {
        return acvarium;
    }

    public void setAcvarium(List<Fish> acvarium) {
        this.acvarium = acvarium;
    }


}