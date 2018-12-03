package movie;

import movie_rental.Customer;

/**
 * Class inherits properties from MovieStrategy. The class deals with calculating rent
 * and providing purchase price for newly released movies.
 */
public class NewReleaseStrategy extends MovieStrategy {

    public static final int NEW_RELEASE_PRICE = 3;
    
    public static final int NEW_RELEASE_FREQUENT_RENTER_POINTS = 1;
    public static final int NEW_RELEASE_BONUS_FREQUENT_RENTER_POINTS = 1;

    public static final int NEW_RELEASE_PURCHASE_PRICE = 15;

    public double calculateRent(MovieRental each) {
        double thisAmount = 0.0;
        thisAmount += each.getDaysRented() * NEW_RELEASE_PRICE;
        return thisAmount;
    }
    
    
    public int calculatePoints(MovieRental each) {
        int frequentRenterPoints = 0;
        frequentRenterPoints += NEW_RELEASE_FREQUENT_RENTER_POINTS;
        
     
        // add bonus for a two day new release rental
        if (each.getDaysRented() > 1) {
            frequentRenterPoints += NEW_RELEASE_BONUS_FREQUENT_RENTER_POINTS;
        }
        return frequentRenterPoints;
    }

    public double getPurchasePrice(MoviePurchase each){
        return NEW_RELEASE_PURCHASE_PRICE;
    }
}
