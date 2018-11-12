package Movie;

/**
 * Class inherits properties from MovieStrategy. The class deals with calculating rent
 * and providing purchase price for newly released movies.
 */
public class NewReleaseStrategy extends MovieStrategy {

    public static final int NEW_RELEASE_PRICE = 3;

    public static final int NEW_RELEASE_PURCHASE_PRICE = 15;

    public double calculateRent(MovieRental each) {
        double thisAmount = 0.0;
        thisAmount += each.getDaysRented() * NEW_RELEASE_PRICE;
        return thisAmount;
    }

    public double getPurchasePrice(MoviePurchase each){
        return NEW_RELEASE_PURCHASE_PRICE;
    }
}
