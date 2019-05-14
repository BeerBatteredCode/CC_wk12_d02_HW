package Stalls;

import Interfaces.IReviewed;
import Interfaces.ISecurity;
import Visitors.Visitor;

public class Tobacco extends Stall implements ISecurity, IReviewed {

    private String name;
    private String ownerName;
    private int parkingSpot;
    private int rating;

    public Tobacco(String name, String ownerName, int parkingSpot, int rating){
        super(name, ownerName, parkingSpot);
        this.rating = rating;
    }

    public boolean isAllowedTo(Visitor visitor){
        return visitor.getHeight() >= 4.5 ? true : false;
    }

    public int getRating(){
        return rating;
    }
}
