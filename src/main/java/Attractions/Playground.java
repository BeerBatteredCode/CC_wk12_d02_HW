package Attractions;

import Attractions.Attraction;
import Interfaces.IReviewed;
import Interfaces.ISecurity;
import Visitors.Visitor;

public class Playground extends Attraction implements ISecurity, IReviewed {

    private String name;
    private int rating;

    public Playground(String name, int rating){
        super(name);
        this.rating = rating;
    }

    public boolean isAllowedTo(Visitor visitor){
        return visitor.getHeight() >= 4.5 ? true : false;
    }

    public int getRating(){
        return rating;
    }
}
