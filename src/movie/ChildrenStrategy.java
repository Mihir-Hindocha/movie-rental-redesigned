package movie;

import movie_rental.Customer;

/**
 * Class inherits properties from MovieStrategy. The class deals with calculating rent
 * and providing purchase price for children's movies.
 */
public class ChildrenStrategy extends MovieStrategy {

    public static final double CHILDREN_BASE_PRICE = 1.5;
    public static final int CHILDREN_DURATION = 3;
    public static final double CHILDREN_VARIABLE_PRICE = 1.5;
    
    public static final int CHILDREN_FREQUENT_RENTER_POINTS = 1;

    public static final double CHILDREN_PURCHASE_PRICE = 8;
    

    public double calculateRent(MovieRental each) {
        double thisAmount = 0.0;
        thisAmount += CHILDREN_BASE_PRICE;
        if (each.getDaysRented() > CHILDREN_DURATION) {
            thisAmount += (each.getDaysRented() - CHILDREN_DURATION) * CHILDREN_VARIABLE_PRICE;
        }
        return thisAmount;
    }
    
    public int calculatePoints(MovieRental each) {
        int frequentRenterPoints = 0;
        frequentRenterPoints += CHILDREN_FREQUENT_RENTER_POINTS;
        return frequentRenterPoints;
    }

    public double getPurchasePrice(MoviePurchase each){
        return CHILDREN_PURCHASE_PRICE;
    }
}
