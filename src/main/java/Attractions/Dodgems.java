package Attractions;

import Attractions.Attraction;
import Interfaces.IReviewed;
import Interfaces.ITicketed;
import Visitors.Visitor;

public class Dodgems extends Attraction implements ITicketed, IReviewed {

    private String name;
    private double price;
    private int rating;

    public Dodgems(String name, double price, int rating){
        super(name);
        this.price = price;
        this.rating = rating;
    }

    public double defaultPrice(){
        return price;
    }

    public double priceFor(Visitor visitor) {
        return visitor.getAge() >= 18 ? price : price / 2;
    }

    public int getRating(){
        return rating;
    }
}
