package Attractions;

import Attractions.Attraction;
import Interfaces.IReviewed;

public class Park extends Attraction implements IReviewed {

    private String name;
    private int rating;

    public Park(String name, int rating){
        super(name);
        this.rating = rating;
    }

    public int getRating(){
        return rating;
    }
}
