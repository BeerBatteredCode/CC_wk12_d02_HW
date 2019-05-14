package Stalls;

import Interfaces.IReviewed;

public class CandyFloss extends Stall implements IReviewed {

    private String name;
    private String ownerName;
    private int parkingSpot;
    private int rating;

    public CandyFloss(String name, String ownerName, int parkingSpot, int rating){
        super(name, ownerName, parkingSpot);
        this.rating = rating;
    }

    public int getRating(){
        return rating;
    }
}
