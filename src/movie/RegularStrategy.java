package movie;

import movie_rental.Customer;

/**
 * Class inherits properties from MovieStrategy. The class deals with calculating rent
 * and providing purchase price for regular movies.
 */
public class RegularStrategy extends MovieStrategy {

    public static final int REGULAR_BASE_PRICE = 2;
    public static final int REGULAR_DURATION = 2;
    public static final double REGULAR_VARIABLE_PRICE = 1.5;
    
    public static final int REGULAR_FREQUENT_RENTER_POINTS = 1;

    public static final double REGULAR_PURCHASE_PRICE = 10;

    public double calculateRent(MovieRental each) {
        double thisAmount = 0.0;
        thisAmount += REGULAR_BASE_PRICE;
        if (each.getDaysRented() > REGULAR_DURATION) {
            thisAmount += (each.getDaysRented() - REGULAR_DURATION) * REGULAR_VARIABLE_PRICE;
        }
        return thisAmount;
    }

    public int calculatePoints(MovieRental each) {
        int frequentRenterPoints = 0;
        frequentRenterPoints += REGULAR_FREQUENT_RENTER_POINTS;
        return frequentRenterPoints;
    }
    
    public double getPurchasePrice(MoviePurchase each){
        return REGULAR_PURCHASE_PRICE;
    }
    
}
