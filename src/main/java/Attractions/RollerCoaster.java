package Attractions;

import Interfaces.IReviewed;
import Interfaces.ISecurity;
import Interfaces.ITicketed;
import Visitors.Visitor;

public class RollerCoaster extends Attraction implements ITicketed, ISecurity, IReviewed {

    private String name;
    private double price;
    private int rating;

    public RollerCoaster(String name, double price, int rating){
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

    public boolean isAllowedTo(Visitor visitor){
        return visitor.getHeight() >= 4.5 ? true : false;
    }

    public int getRating(){
        return rating;
    }
}
