package Stalls;

import Interfaces.IReviewed;

public class Icecream extends Stall implements IReviewed {

    private String name;
    private String ownerName;
    private int parkingSpot;
    private int rating;

    public Icecream(String name, String ownerName, int parkingSpot, int rating){
        super(name, ownerName, parkingSpot);
        this.rating = rating;
    }

    public int getRating(){
        return rating;
    }
}
