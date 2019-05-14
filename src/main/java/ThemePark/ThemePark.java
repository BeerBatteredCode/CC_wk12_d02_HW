package ThemePark;

import Attractions.Attraction;
import Interfaces.IReviewed;
import Stalls.Stall;

import java.util.ArrayList;

public class ThemePark {
     private ArrayList<Attraction> allAttractions;
     private ArrayList<Stall> allStalls;
     private ArrayList<IReviewed> allReviews;

     public ThemePark(){
         this.allAttractions = new ArrayList<>();
         this.allStalls = new ArrayList<>();
         this.allReviews = new ArrayList<>();
     }

     public int getAllAttractions(){
         return allAttractions.size();
     }

     public int getAllStalls(){
         return allStalls.size();
     }

     public int getAllReviews(){
         return allReviews.size();
     }

}
