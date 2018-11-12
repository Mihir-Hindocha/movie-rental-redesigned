package Books;

/**
 * Class inherits properties from BookStrategy. The class deals with calculating rent
 * and providing purchase price for regular movies.
 */
public class RegularStrategy extends BookStrategy {

    public static final int REGULAR_BASE_PRICE = 2;
    public static final int REGULAR_DURATION = 2;
    public static final double REGULAR_VARIABLE_PRICE = 1.5;

    public static final double REGULAR_PURCHASE_PRICE = 10;

    public double calculateRent(BookRental each) {
        double thisAmount = 0.0;
        thisAmount += REGULAR_BASE_PRICE;
        if (each.getDaysRented() > REGULAR_DURATION) {
            thisAmount += (each.getDaysRented() - REGULAR_DURATION) * REGULAR_VARIABLE_PRICE;
        }
        return thisAmount;
    }

    public double getPurchasePrice(BookPurchase each){
        return REGULAR_PURCHASE_PRICE;
    }
}
